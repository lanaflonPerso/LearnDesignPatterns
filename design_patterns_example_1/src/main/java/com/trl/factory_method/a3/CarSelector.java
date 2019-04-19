package com.trl.factory_method.a3;

// fabruka po sozdaniy avtomobilei
public class CarSelector {

    // fabrichnui method kotorui sozdaiot nyznui avtomobil
    public Car getCar(RoadType raodType) {

        Car  car = null;

        switch (raodType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }

        return car;
    }
}
