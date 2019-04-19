package com.trl.decorator.a1.decorators;

import com.trl.decorator.a1.objects.Component;

public class BordeDecorator extends Decorator {

    public BordeDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added border");
    }
}
