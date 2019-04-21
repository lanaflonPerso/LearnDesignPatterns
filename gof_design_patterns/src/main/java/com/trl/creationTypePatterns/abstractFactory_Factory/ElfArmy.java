package com.trl.creationTypePatterns.abstractFactory_Factory;

public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
