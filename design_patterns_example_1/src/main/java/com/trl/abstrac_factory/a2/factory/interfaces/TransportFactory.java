package com.trl.abstrac_factory.a2.factory.interfaces;


import com.trl.abstrac_factory.a2.transport.interfaces.Aircraft;
import com.trl.abstrac_factory.a2.transport.interfaces.Car;

// fabrika po sozsaniy transportnux sredstv
public interface TransportFactory {

    // chto fabrika bydit proizvodit
    Car createCar();                // avtomobili
    Aircraft createAircraft();      // samolotu
}
