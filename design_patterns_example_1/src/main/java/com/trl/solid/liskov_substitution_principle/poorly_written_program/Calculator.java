package com.trl.solid.liskov_substitution_principle.poorly_written_program;

public class Calculator {
    public static int calculaSquare(Rectangle rectangle){
        return rectangle.getSquare();
    }
}
