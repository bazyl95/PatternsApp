package com.company.chain_of_responsibility;

import com.company.shapes.Shape;
import com.company.strategy.ColorStrategy;

public class ShapeColorHandler extends AbstractShapeHandler{

    private ColorStrategy strategy;

    public ShapeColorHandler(ColorStrategy strategy) {
        this.strategy = strategy;
    }
    @Override
    public boolean isShapeValid(Shape shape) {
        if (strategy.isForbiddenColor(shape.getColor())) {
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
