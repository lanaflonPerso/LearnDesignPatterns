package com.trl.abstrac_factory.a2;

import com.trl.abstrac_factory.a2.factory.impl.RussianFactory;
import com.trl.abstrac_factory.a2.factory.impl.USAFactory;
import com.trl.abstrac_factory.a2.factory.interfaces.TransportFactory;
import com.trl.abstrac_factory.a2.transport.interfaces.Aircraft;
import com.trl.abstrac_factory.a2.transport.interfaces.Car;

public class Test {
    public static void main(String[] args) {

        TransportFactory russianFactory = new RussianFactory();
        Aircraft aircraftRussion = russianFactory.createAircraft();
        aircraftRussion.flight();
        Car carRussion = russianFactory.createCar();
        carRussion.drive();
        carRussion.stop();
        System.out.println("------------------------");

        TransportFactory usa_factory = new USAFactory();
        Aircraft aircraftUSA = usa_factory.createAircraft();
        aircraftUSA.flight();
        Car carUSA = usa_factory.createCar();
        carUSA.drive();
        carUSA.stop();
    }
}
