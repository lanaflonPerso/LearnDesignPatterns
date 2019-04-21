package com.trl.creationTypePatterns.abstractFactory_Factory;

public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
