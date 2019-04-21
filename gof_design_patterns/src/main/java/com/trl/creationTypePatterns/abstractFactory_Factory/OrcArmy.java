package com.trl.creationTypePatterns.abstractFactory_Factory;

public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
