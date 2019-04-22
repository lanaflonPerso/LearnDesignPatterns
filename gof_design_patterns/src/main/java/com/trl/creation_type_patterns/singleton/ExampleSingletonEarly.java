package com.trl.creation_type_patterns.singleton;

public class ExampleSingletonEarly {
    private static final ExampleSingletonEarly ourInstance = new ExampleSingletonEarly();

    public static ExampleSingletonEarly getInstance() {
        return ourInstance;
    }

    private ExampleSingletonEarly() {
    }
}
