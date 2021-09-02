package com.company.factories;

import com.company.shapes.Shape;
import com.company.shapes.SquareShape;
import com.company.shapes.TriangleShape;

public class TriangleShapeFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new TriangleShape(getRandomColor());
    }
}
