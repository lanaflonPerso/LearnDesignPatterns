package com.trl.abstrac_factory.a2.factory.impl;

import com.trl.abstrac_factory.a2.factory.interfaces.TransportFactory;
import com.trl.abstrac_factory.a2.transport.impl.aircraft.Boing747;
import com.trl.abstrac_factory.a2.transport.impl.car.Porsche;
import com.trl.abstrac_factory.a2.transport.interfaces.Aircraft;
import com.trl.abstrac_factory.a2.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing747();
    }
}
