package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    private String name;

    public AliceBobEvaluator(String name) {
        this.name = name;
    }


    public boolean isAlice() {
        return name.toLowerCase().equals(AliceBobEnum.ALICE.name().toLowerCase());
    }

    public boolean isBob() {
        return name.toLowerCase().equals(AliceBobEnum.BOB.name().toLowerCase());
    }
}
