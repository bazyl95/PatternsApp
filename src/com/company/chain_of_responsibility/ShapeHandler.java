package com.company.chain_of_responsibility;

import com.company.shapes.Shape;

public interface ShapeHandler {
    void addHandler(ShapeHandler handler);
    boolean isShapeValid(Shape shape);
}
