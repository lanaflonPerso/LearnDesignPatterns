package com.trl.abstrac_factory.a2.transport.impl.aircraft;

import com.trl.abstrac_factory.a2.transport.interfaces.Aircraft;

public class Boing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boing747 flight");
    }
}
