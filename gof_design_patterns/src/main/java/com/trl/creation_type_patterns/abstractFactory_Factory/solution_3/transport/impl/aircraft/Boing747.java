package com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.impl.aircraft;

import com.trl.creation_type_patterns.abstractFactory_Factory.solution_3.transport.interfaces.Aircraft;

public class Boing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boing747 flight");
    }
}
