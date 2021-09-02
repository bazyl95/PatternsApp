package com.company.shapes;

public class TriangleShape implements Shape{

    private final String shapeType;
    private final String color;

    public TriangleShape(String color) {
        this.shapeType = "Triangle";
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
}
