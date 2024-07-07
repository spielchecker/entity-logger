package com.entity_logger;
import net.runelite.client.config.*;

import java.awt.Color;
import java.util.Locale;

@ConfigGroup("example")
public interface EntityLoggerConfig extends Config
{

	////////////////////////////////////////////////////////////////
	//////////////////////////////// Entity Highlight Settings
	////////////////////////////////////////////////////////////////

	@ConfigSection(
			name = "Entity highlight settings",
			description = "Settings that control entity highlighting",
			position = 0,
			closedByDefault = true
	)
	String entityHighlightSettings = "Entity Highlight Settings";

	@ConfigItem(
			keyName = "inscopeHighlightMethod",
			name = "In-scope highlighting method",
			description = "In-scope highlighting method",
			section = entityHighlightSettings,
			position = 0
	)
	default HighlightMethod inscopeHighlightMethod()
	{
		return HighlightMethod.NONE;
	}
	@ConfigItem(
			keyName = "inscopeHighlightColor",
			name = "Color to highlight in-scope entities with",
			description = "Which color to highlight in-scope entities with",
			section = entityHighlightSettings,
			position = 1
	)
	default Color inscopeHighlightColor()
	{
		return new Color(0xFFFF00);
	}

	@ConfigItem(
			keyName = "outofscopeHighlightMethod",
			name = "Out-of-scope highlighting method",
			description = "Out-of-scope highlighting method",
			section = entityHighlightSettings,
			position = 2
	)
	default HighlightMethod outofscopeHighlightMethod()
	{
		return HighlightMethod.NONE;
	}
	@ConfigItem(
			keyName = "outofscopeHighlightColor",
			name = "Color to highlight out-of-scope entities with",
			description = "Which color to highlight out-of-scope entities with",
			section = entityHighlightSettings,
			position = 3
	)
	default Color outofscopeHighlightColor()
	{
		return new Color(0xFF00FF);
	}

	@ConfigItem(
			keyName = "backloggedHighlightMethod",
			name = "Backlogged highlighting method",
			description = "Backlogged highlighting method",
			section = entityHighlightSettings,
			position = 4
	)
	default HighlightMethod backloggedHighlightMethod()
	{
		return HighlightMethod.NONE;
	}
	@ConfigItem(
			keyName = "backloggedHighlightColor",
			name = "Color to highlight backlogged entities with",
			description = "Which color to highlight backlogged entities with",
			section = entityHighlightSettings,
			position = 5
	)
	default Color backloggedHighlightColor()
	{
		return new Color(0xFF0000);
	}

	@ConfigItem(
			keyName = "finishedHighlightMethod",
			name = "Finished highlighting method",
			description = "Finished highlighting method",
			section = entityHighlightSettings,
			position = 6
	)
	default HighlightMethod finishedHighlightMethod()
	{
		return HighlightMethod.NONE;
	}
	@ConfigItem(
			keyName = "finishedHighlightColor",
			name = "Color to highlight finished entities with",
			description = "Which color to highlight finished entities with",
			section = entityHighlightSettings,
			position = 7
	)
	default Color finishedHighlightColor()
	{
		return new Color(0x00FF00);
	}

	////////////////////////////////////////////////////////////////
	//////////////////////////////// Entity Scan Settings
	////////////////////////////////////////////////////////////////

	@ConfigSection(
			name = "Entity scan settings",
			description = "Settings that control scans for entities",
			position = 1,
			closedByDefault = true
	)
	String entityScanSettings = "Entity Scan Settings";

	@Range(
			max = 30,
			min = 0
	)
	@ConfigItem(
			keyName = "scanRadius",
			name = "Scan radius",
			description = "Distance for entities to be scanned and logged",
			section = entityScanSettings,
			position = 0
	)
	default int scanRadius()
	{
		return 15;
	}

	@ConfigItem(
			keyName = "toggleInscopeExamine",
			name = "Examine in-scope",
			description = "Toggle whether the examine action is in scope",
			section = entityScanSettings,
			position = 1
	)
	default boolean toggleInscopeExamine()
	{
		return false;
	}

	@ConfigItem(
			keyName = "toggleInscopeItemSpawns",
			name = "Item spawns in-scope",
			description = "Toggle whether item spawns are in scope",
			section = entityScanSettings,
			position = 2
	)
	default boolean toggleInscopeItemSpawns()
	{
		return true;
	}

	////////////////////////////////////////////////////////////////
	//////////////////////////////// Other Settings
	////////////////////////////////////////////////////////////////



	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	} //TODO: Get rid of this
}
