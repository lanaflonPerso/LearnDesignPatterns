package com.trl.abstrac_factory.a2.transport.impl.aircraft;

import com.trl.abstrac_factory.a2.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU134 flight");
    }
}
