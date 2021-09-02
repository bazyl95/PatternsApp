package com.company.facade;

import com.company.shapes.Shape;

public class ShapeIdDecorator {

    private int idCounter = 1;

    public Shape createShapeWithId(Shape shape) {
        return new ShapeWithId(shape, idCounter++);
    }
}
