package com.trl.decorator.a1.decorators;

import com.trl.decorator.a1.objects.Component;

// Etot class mozeb bit abstract class ili interface
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
