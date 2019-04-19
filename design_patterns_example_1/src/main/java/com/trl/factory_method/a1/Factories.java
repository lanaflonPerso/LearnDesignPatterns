package com.trl.factory_method.a1;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        // Realizacii polnosty vzaimozaminimu:
        serviceConsumer(Implementation2.factory);
    }
}
