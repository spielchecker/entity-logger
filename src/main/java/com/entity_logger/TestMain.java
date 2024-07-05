package com.entity_logger;

public class TestMain {
    public static void main(String args[]){
        System.out.println("Testing stuff");
        for (EntityStates state : EntityStates.values()){
            System.out.println(state.description);
        }
    }
}
