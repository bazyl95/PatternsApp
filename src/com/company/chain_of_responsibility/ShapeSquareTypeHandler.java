package com.company.chain_of_responsibility;

import com.company.shapes.Shape;

public class ShapeSquareTypeHandler extends AbstractShapeHandler{

    @Override
    public boolean isShapeValid(Shape shape) {
        if (shape.getShapeType().equalsIgnoreCase("Square")) {
            return nextCheck(shape);
        }
        return false;
    }

    @Override
    public boolean nextCheck(Shape shape) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.isShapeValid(shape);
    }
}
