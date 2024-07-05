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
			keyName = "toggleHighlightInscopeHull",
			name = "Highlight in-scope entities by hull",
			description = "Toggle whether in-scope entities will be highlighted by hull",
			section = entityHighlightSettings,
			position = 0
	)
	default boolean toggleHighlightInscopeHull()
	{
		return false;
	}
	@ConfigItem(
			keyName = "highlightInscopeHullColor",
			name = "Color to highlight in-scope entities by hull",
			description = "Which color to highlight in-scope entities by hull",
			section = entityHighlightSettings,
			position = 1
	)
	default Color highlightInscopeHullColor()
	{
		return new Color(0xFFFFFF00);
	}
	@ConfigItem(
			keyName = "highlightInscopeHullInteriorColor",
			name = "Color to highlight in-scope entities by hull interior",
			description = "Which color to highlight in-scope entities by hull interior",
			section = entityHighlightSettings,
			position = 2
	)
	default Color highlightInscopeHullInteriorColor()
	{
		return new Color(0x1FFFFF00);
	}
	@ConfigItem(
			keyName = "toggleHighlightInscopeOutline",
			name = "Highlight in-scope entities by outline",
			description = "Toggle whether in-scope entities will be highlighted by outline",
			section = entityHighlightSettings,
			position = 3
	)
	default boolean toggleHighlightInscopeOutline()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightInscopeOutlineColor",
			name = "Color to highlight in-scope entities by outline",
			description = "Which color to highlight in-scope entities by outline",
			section = entityHighlightSettings,
			position = 4
	)
	default Color highlightInscopeOutlineColor()
	{
		return new Color(0xFFFFFF00);
	}
	@ConfigItem(
			keyName = "highlightInscopeOutlineInteriorColor",
			name = "Color to highlight in-scope entities by outline interior",
			description = "Which color to highlight in-scope entities by outline interior",
			section = entityHighlightSettings,
			position = 5
	)
	default Color highlightInscopeOutlineInteriorColor()
	{
		return new Color(0x1FFFFF00);
	}

	@ConfigItem(
			keyName = "toggleHighlightBackloggedHull",
			name = "Highlight backlogged entities by hull",
			description = "Toggle whether backlogged entities will be highlighted by hull",
			section = entityHighlightSettings,
			position = 6
	)
	default boolean toggleHighlightBackloggedHull()
	{
		return false;
	}
	@ConfigItem(
			keyName = "highlightBackloggedHullColor",
			name = "Color to highlight backlogged entities by hull",
			description = "Which color to highlight backlogged entities by hull",
			section = entityHighlightSettings,
			position = 7
	)
	default Color highlightBackloggedHullColor()
	{
		return new Color(0xFFFF0000);
	}
	@ConfigItem(
			keyName = "highlightBackloggedHullInteriorColor",
			name = "Color to highlight backlogged entities by hull interior",
			description = "Which color to highlight backlogged entities by hull interior",
			section = entityHighlightSettings,
			position = 8
	)
	default Color highlightBackloggedHullInteriorColor()
	{
		return new Color(0x1FFF0000);
	}
	@ConfigItem(
			keyName = "toggleHighlightBackloggedOutline",
			name = "Highlight backlogged entities by outline",
			description = "Toggle whether backlogged entities will be highlighted by outline",
			section = entityHighlightSettings,
			position = 9
	)
	default boolean toggleHighlightBackloggedOutline()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightBackloggedOutlineColor",
			name = "Color to highlight backlogged entities by outline",
			description = "Which color to highlight backlogged entities by outline",
			section = entityHighlightSettings,
			position = 10
	)
	default Color highlightBackloggedOutlineColor()
	{
		return new Color(0xFFFF0000);
	}
	@ConfigItem(
			keyName = "highlightBackloggedOutlineInteriorColor",
			name = "Color to highlight backlogged entities by outline interior",
			description = "Which color to highlight backlogged entities by outline interior",
			section = entityHighlightSettings,
			position = 11
	)
	default Color highlightBackloggedOutlineInteriorColor()
	{
		return new Color(0x1FFF0000);
	}

	@ConfigItem(
			keyName = "toggleHighlightOutofscopeHull",
			name = "Highlight out-of-scope entities by hull",
			description = "Toggle whether out-of-scope entities will be highlighted by hull",
			section = entityHighlightSettings,
			position = 12
	)
	default boolean toggleHighlightOutofscopeHull()
	{
		return false;
	}
	@ConfigItem(
			keyName = "highlightOutofscopeHullColor",
			name = "Color to highlight out-of-scope entities by hull",
			description = "Which color to highlight out-of-scope entities by hull",
			section = entityHighlightSettings,
			position = 13
	)
	default Color highlightOutofscopeHullColor()
	{
		return new Color(0xFFFF00FF);
	}
	@ConfigItem(
			keyName = "highlightOutofscopeHullInteriorColor",
			name = "Color to highlight out-of-scope entities by hull interior",
			description = "Which color to highlight out-of-scope entities by hull interior",
			section = entityHighlightSettings,
			position = 14
	)
	default Color highlightOutofscopeHullInteriorColor()
	{
		return new Color(0x1FFF00FF);
	}
	@ConfigItem(
			keyName = "toggleHighlightOutofscopeOutline",
			name = "Highlight out-of-scope entities by outline",
			description = "Toggle whether out-of-scope entities will be highlighted by outline",
			section = entityHighlightSettings,
			position = 15
	)
	default boolean toggleHighlightOutofscopeOutline()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightOutofscopeOutlineColor",
			name = "Color to highlight out-of-scope entities by outline",
			description = "Which color to highlight out-of-scope entities by outline",
			section = entityHighlightSettings,
			position = 16
	)
	default Color highlightOutofscopeOutlineColor()
	{
		return new Color(0xFFFF00FF);
	}
	@ConfigItem(
			keyName = "highlightOutofscopeOutlineInteriorColor",
			name = "Color to highlight out-of-scope entities by outline interior",
			description = "Which color to highlight out-of-scope entities by outline interior",
			section = entityHighlightSettings,
			position = 17
	)
	default Color highlightOutofscopeOutlineInteriorColor()
	{
		return new Color(0x1FFF00FF);
	}

	@ConfigItem(
			keyName = "toggleHighlightFinishedHull",
			name = "Highlight finished entities by hull",
			description = "Toggle whether finished entities will be highlighted by hull",
			section = entityHighlightSettings,
			position = 18
	)
	default boolean toggleHighlightFinishedHull()
	{
		return false;
	}
	@ConfigItem(
			keyName = "highlightFinishedHullColor",
			name = "Color to highlight finished entities by hull",
			description = "Which color to highlight finished entities by hull",
			section = entityHighlightSettings,
			position = 19
	)
	default Color highlightFinishedHullColor()
	{
		return new Color(0xFF00FF00);
	}
	@ConfigItem(
			keyName = "highlightFinishedHullInteriorColor",
			name = "Color to highlight finished entities by hull interior",
			description = "Which color to highlight finished entities by hull interior",
			section = entityHighlightSettings,
			position = 20
	)
	default Color highlightFinishedHullInteriorColor()
	{
		return new Color(0x1F00FF00);
	}
	@ConfigItem(
			keyName = "toggleHighlightFinishedOutline",
			name = "Highlight finished entities by outline",
			description = "Toggle whether finished entities will be highlighted by outline",
			section = entityHighlightSettings,
			position = 21
	)
	default boolean toggleHighlightFinishedOutline()
	{
		return true;
	}
	@ConfigItem(
			keyName = "highlightFinishedOutlineColor",
			name = "Color to highlight finished entities by outline",
			description = "Which color to highlight finished entities by outline",
			section = entityHighlightSettings,
			position = 22
	)
	default Color highlightFinishedOutlineColor()
	{
		return new Color(0xFF00FF00);
	}
	@ConfigItem(
			keyName = "highlightFinishedOutlineInteriorColor",
			name = "Color to highlight finished entities by outline interior",
			description = "Which color to highlight finished entities by outline interior",
			section = entityHighlightSettings,
			position = 23
	)
	default Color highlightFinishedOutlineInteriorColor()
	{
		return new Color(0x1F00FF00);
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
