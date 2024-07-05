package com.entity_logger;

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
}
