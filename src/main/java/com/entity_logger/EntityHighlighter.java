package com.entity_logger;

import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.outline.ModelOutlineRenderer;

import javax.inject.Inject;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class EntityHighlighter extends Overlay {

    private final Client client;
    private final EntityLoggerConfig config;
    private final ModelOutlineRenderer modelOutlineRenderer;

    private List<LoggedNPC> npcs;

    @Inject
    public EntityHighlighter(Client client, EntityLoggerConfig config, ModelOutlineRenderer modelOutlineRenderer)
    {
        this.client = client;
        this.config = config;
        this.modelOutlineRenderer = modelOutlineRenderer;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    public void updateNPCList(List<NPC> npcs)
    {
        this.npcs = new LinkedList<LoggedNPC>();
        if (!npcs.isEmpty()) {
            for (NPC npc : npcs) {
                this.npcs.add(new LoggedNPC(npc));
            }
        }
    }

    public Dimension render(Graphics2D graphics)
    {
        for (LoggedNPC npc : this.npcs) {
            this.modelOutlineRenderer.drawOutline(npc.npc, 4, this.config.highlightInscopeOutlineColor(), 2);
        }
        return null;
    }

    public void applyHighlight(Client client)
    {
        client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Starting to apply highlight", null);
        for (LoggedNPC npc : this.npcs) {
            String npc_msg = npc.npc.getName() + " is in state " + npc.state.description;
            System.out.println(npc_msg);
            client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", npc_msg, null);
        }
    }
}
