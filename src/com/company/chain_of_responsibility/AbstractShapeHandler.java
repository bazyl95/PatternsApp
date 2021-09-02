package com.company.chain_of_responsibility;

import com.company.shapes.Shape;

public abstract class AbstractShapeHandler implements ShapeHandler{
    protected ShapeHandler nextHandler;

    abstract boolean nextCheck(Shape shape);

    @Override
    public void addHandler(ShapeHandler handler) {
        nextHandler = handler;
    }
}
