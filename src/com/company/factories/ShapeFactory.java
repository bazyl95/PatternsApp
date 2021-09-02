package com.company.factories;

import com.company.shapes.Shape;

import java.util.Random;

public abstract class ShapeFactory {

    private final Random randomizer = new Random();

    public abstract Shape createShape();

    protected String getRandomColor() {
        switch (randomizer.nextInt(3)) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            default:
                return "Blue";
        }
    }
}
