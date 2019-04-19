package com.trl.factory_method.a3;

public class Geep implements Car{

    @Override
    public void drive() {
        System.out.println("Drive Geep");
    }

    @Override
    public void stop() {
        System.out.println("Stop Geep");
    }
}
