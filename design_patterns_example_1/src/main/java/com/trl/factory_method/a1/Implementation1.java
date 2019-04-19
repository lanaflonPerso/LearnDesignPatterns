package com.trl.factory_method.a1;


public class Implementation1 implements Service{
    private Implementation1(){}
    @Override
    public void method1() {
        System.out.println("Implementation1 metod1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 metod2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {

                @Override
                public Service getService() {
                    return new Implementation1();
                }
    };
}
