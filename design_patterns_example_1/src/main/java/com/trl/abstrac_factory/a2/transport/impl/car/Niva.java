package com.trl.abstrac_factory.a2.transport.impl.car;

import com.trl.abstrac_factory.a2.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public void drive() {
        System.out.println("Drive Niva");
    }

    @Override
    public void stop() {
        System.out.println("Stop Niva");
    }
}
