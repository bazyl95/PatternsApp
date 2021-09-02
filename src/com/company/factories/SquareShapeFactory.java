package com.company.factories;

import com.company.shapes.Shape;
import com.company.shapes.SquareShape;

public class SquareShapeFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new SquareShape(getRandomColor());
    }
}
