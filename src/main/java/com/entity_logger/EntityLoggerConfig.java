package com.entity_logger;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.Color;
import java.util.Locale;

@ConfigGroup("example")
public interface EntityLoggerConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	} //TODO: Get rid of this

	@ConfigItem(
			keyName = "toggleInscopeExamine",
			name = "Examine in-scope",
			description = "Toggle whether the examine action is in scope",
			position = 0
	)
	default boolean toggleInscopeExamine()
	{
		return false;
	}

	@ConfigItem(
			keyName = "toggleInscopeItemSpawns",
			name = "Item spawns in-scope",
			description = "Toggle whether item spawns are in scope",
			position = 1
	)
	default boolean toggleInscopeItemSpawns()
	{
		return true;
	}

	@ConfigItem(
			keyName = "toggleHighlightInscope",
			name = "Highlight in-scope entities",
			description = "Toggle whether in-scope entities will be highlighted",
			position = 2
	)
	default boolean toggleHighlightInscope()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightInscopeColor",
			name = "In-scope highlight color",
			description = "Which color to highlight in-scope entities",
			position = 3
	)
	default Color highlightInscopeColor()
	{
		return new Color(0xFFFFE533);
	}

	@ConfigItem(
			keyName = "toggleHighlightBacklogged",
			name = "Highlight backlogged entities",
			description = "Toggle whether backlogged entities will be highlighted",
			position = 4
	)
	default boolean toggleHighlightBacklogged()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightBackloggedColor",
			name = "Backlogged highlight color",
			description = "Which color to highlight backlogged entities",
			position = 5
	)
	default Color highlightBackloggedColor()
	{
		return new Color(0xFFFF0000);
	}

	@ConfigItem(
			keyName = "toggleHighlightOutofscope",
			name = "Highlight out-of-scope entities",
			description = "Toggle whether out-of-scope entities will be highlighted",
			position = 6
	)
	default boolean toggleHighlightOutofscope()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightOutofscopeColor",
			name = "Out-of-scope highlight color",
			description = "Which color to highlight out-of-scope entities",
			position = 7
	)
	default Color highlightOutofscopeColor()
	{
		return new Color(0x7F007F);
	}

	@ConfigItem(
			keyName = "toggleHighlightFinished",
			name = "Highlight finished entities",
			description = "Toggle whether finished entities will be highlighted",
			position = 8
	)
	default boolean toggleHighlightFinished()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightFinishedColor",
			name = "Finished highlight color",
			description = "Which color to highlight finished entities",
			position = 9
	)
	default Color highlightFinishedColor()
	{
		return new Color(0x00FF00);
	}
}
