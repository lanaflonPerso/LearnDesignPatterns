package com.trl.abstrac_factory.a2.factory.impl;

import com.trl.abstrac_factory.a2.factory.interfaces.TransportFactory;
import com.trl.abstrac_factory.a2.transport.impl.aircraft.TU134;
import com.trl.abstrac_factory.a2.transport.impl.car.Niva;
import com.trl.abstrac_factory.a2.transport.interfaces.Aircraft;
import com.trl.abstrac_factory.a2.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
