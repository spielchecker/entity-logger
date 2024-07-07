package com.entity_logger;

import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
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
        HighlightMethod highlightMethod = null;
        HighlightMethod.OutlineType outlineType;
        HighlightMethod.FillType fillType;
        Color color = null;
        for (LoggedNPC npc : this.npcs) {
            switch (npc.state) {
                case IN_SCOPE:
                    highlightMethod = config.inscopeHighlightMethod();
                    color = config.inscopeHighlightColor();
                    break;
                case OUT_OF_SCOPE:
                    highlightMethod = config.outofscopeHighlightMethod();
                    color = config.outofscopeHighlightColor();
                    break;
                case BACKLOGGED:
                    highlightMethod = config.backloggedHighlightMethod();
                    color = config.backloggedHighlightColor();
                    break;
                case FINISHED:
                    highlightMethod = config.finishedHighlightMethod();
                    color = config.finishedHighlightColor();
            }
            if (highlightMethod != null)
            {
                outlineType = highlightMethod.outlineType;
                switch (outlineType) {
                    case NONE:
                        break;  // do nothing
                    case OUTLINE:
                        this.modelOutlineRenderer.drawOutline(npc.npc, 4, color, 4);
                        break;
                    case HULL:
                        drawHull(graphics, npc.npc.getConvexHull(), highlightMethod, color);
                }
            }
        }
        return null;
    }

    private void drawHull(Graphics2D graphics, Shape hull, HighlightMethod highlightMethod, Color color)
    {
        Color fillColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), highlightMethod.fillType.alpha);
        graphics.setColor(color);
        graphics.setStroke(new BasicStroke(4));
        graphics.draw(hull);
        graphics.setColor(fillColor);
        graphics.fill(hull);
    }
}
