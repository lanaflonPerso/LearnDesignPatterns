package com.trl.factory_method.a3;

public class NewGeep extends Geep{

    @Override
    public void drive() {
        System.out.println("Drive NewGeep");
    }

    @Override
    public void stop() {
        System.out.println("Stop NewGeep");
    }


    public void newFunction(){
        System.out.println("NewGeep new function work");
    }
}
