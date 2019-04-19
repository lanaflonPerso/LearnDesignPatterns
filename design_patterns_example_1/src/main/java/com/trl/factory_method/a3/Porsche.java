package com.trl.factory_method.a3;

public class Porsche implements Car{

    @Override
    public void drive() {
        System.out.println("Drive Porsche");
    }

    @Override
    public void stop() {
        System.out.println("Stop Porsche");
    }
}
