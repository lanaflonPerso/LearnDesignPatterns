package com.trl.factory_method.a3;

public class Test {
    public static void main(String[] args) {
// --------------------------------------------------------------------------------------------------------------------
//        Car geep = new Geep();
//        geep.drive();
//        geep.stop();

//        Car porsche = new Porsche();
//        porsche.drive();
//        porsche.stop();

//        Car newGeep = new NewGeep();
//        newGeep.drive();
//        newGeep.stop();
// --------------------------------------------------------------------------------------------------------------------
        CarSelector carSelector = new CarSelector();

        Car geep = carSelector.getCar(RoadType.OFF_ROAD);
        geep.drive();
        geep.stop();

        Car porsche = carSelector.getCar(RoadType.CITY);
        porsche.drive();
        porsche.stop();

        Car newGeep = carSelector.getCar(RoadType.GAZON);
        newGeep.drive();
        newGeep.stop();
// --------------------------------------------------------------------------------------------------------------------
    }
}
