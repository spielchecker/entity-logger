package com.entity_logger;

import net.runelite.api.NPC;

/**
 * An NPC that has been tracked by the entity logger, and the information calculated about it
 */
public class LoggedNPC {

    public NPC npc;
    public EntityStates state;

    public LoggedNPC(NPC npc){
        // TODO: Implement actual logic here instead of picking randomly
        this.npc = npc;
        this.state = EntityStates.testRandomState();
    }
}
