package com.trl.singleton;

public class ExampleSingletonEarly {
    private static final ExampleSingletonEarly ourInstance = new ExampleSingletonEarly();

    public static ExampleSingletonEarly getInstance() {
        return ourInstance;
    }

    private ExampleSingletonEarly() {
    }
}
