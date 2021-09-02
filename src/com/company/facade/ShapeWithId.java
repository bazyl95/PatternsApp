package com.company.facade;

import com.company.shapes.Shape;

public class ShapeWithId implements Shape {

    private final Shape shape;
    private final int id;

    public ShapeWithId(Shape shape, int id) {
        this.shape = shape;
        this.id = id;
    }

    @Override
    public String getShapeType() {
        return shape.getShapeType();
    }

    @Override
    public String getColor() {
        return shape.getColor();
    }

    @Override
    public String toString() {
        return shape.toString() + " with id " + id;
    }
}
