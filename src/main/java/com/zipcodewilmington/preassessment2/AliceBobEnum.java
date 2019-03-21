package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    AliceBobEnum() {
    }

    public String getCatchPhrase() {
        return String.format("Hey, my name is %s!", this.name());
    }

    public boolean isAlice() {
        return this.name().equals("ALICE");
    }

    public boolean isBob() {
        return this.name().equals("BOB");
    }
}
