package com.entity_logger;

import java.util.Random;

public enum EntityStates {

    UNINTERACTABLE ("This entity has no methods of interaction."),
    IN_SCOPE ("This entity has an unused method of interaction that is part of the current in-scope tasks."),
    OUT_OF_SCOPE ("This entity has an unused method of interaction that is not part of the current in-scope tasks."),
    BACKLOGGED ("This entity would be in-scope, but interacting with it is blocked behind another task."),
    FINISHED ("This entity has been interacted with in every possible way.")
    ;

    public String description;

    EntityStates(String description){
        this.description = description;
    }

    // TODO: These are for testing, remove them later
    private static final EntityStates[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();
    public static EntityStates testRandomState(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
