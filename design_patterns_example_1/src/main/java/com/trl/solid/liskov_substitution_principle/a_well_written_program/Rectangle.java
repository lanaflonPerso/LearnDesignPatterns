package com.trl.solid.liskov_substitution_principle.a_well_written_program;

public class Rectangle  implements Shape{

    private int wight;
    private int height;

    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }

    @Override
    public String toString() {

        return "Rectangle wight = " + wight + " , height = " + height + "\n" +
                "Rectangle getSquare() = " + getSquare() + "\n";

    }

    @Override
    public int getSquare() {
        return wight * height;
    }

}
