package com.company.shapes;

public class SquareShape implements Shape {

    private final String shapeType;
    private final String color;

    public SquareShape(String color) {
        this.shapeType = "Square";
        this.color = color;
    }

    @Override
    public String getShapeType() {
        return shapeType;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor() + " " + getShapeType();
    }
}
