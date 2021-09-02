package com.company.factories;

import com.company.shapes.CircleShape;
import com.company.shapes.Shape;
import com.company.shapes.SquareShape;

public class CircleShapeFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new CircleShape(getRandomColor());
    }
}
