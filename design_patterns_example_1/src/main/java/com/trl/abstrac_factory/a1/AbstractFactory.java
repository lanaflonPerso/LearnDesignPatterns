package com.trl.abstrac_factory.a1;

public /*abstract*/ interface AbstractFactory {
    default Color getColor(String color) {
        return null;
    }

    default Shape getShape(String shape) {
        return null;
    }
}
