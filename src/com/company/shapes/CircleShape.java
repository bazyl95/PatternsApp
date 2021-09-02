package com.company.shapes;

public class CircleShape implements Shape {

    private final String shapeType;
    private final String color;

    public CircleShape(String color) {
        this.shapeType = "Circle";
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
