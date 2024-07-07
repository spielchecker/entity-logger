package com.entity_logger;

import com.google.inject.Provides;
import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@PluginDescriptor(
	name = "Entity Logger"
)
public class EntityLoggerPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private EntityLoggerConfig config;
	@Inject
	private EntityHighlighter entityHighlighter;
	@Inject
	private OverlayManager overlayManager;

	@Override
	protected void startUp() throws Exception
	{
		this.overlayManager.add(entityHighlighter);
		log.info("Entity logger started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
			// TODO: Clean this all up, this is all for debugging
			for (EntityStates state : EntityStates.values()){
				client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", state.toString(), null);
			}
		}
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		LocalPoint currentPosition = client.getLocalPlayer().getLocalLocation();
		// Get all NPCs in range and update the highlighter
		List<NPC> npcList = client.getNpcs()
				.stream()
				.filter(npc -> (npc.getLocalLocation().distanceTo(currentPosition) / 128) <= config.scanRadius())
				.collect(Collectors.toList());
		this.entityHighlighter.updateNPCList(npcList);
	}

	@Provides
	EntityLoggerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(EntityLoggerConfig.class);
	}
}
