package com.trl.decorator.a1.objects;

public class TextView implements Component{
    @Override
    public void draw() {
        System.out.println("Draw TextView");
    }
}
