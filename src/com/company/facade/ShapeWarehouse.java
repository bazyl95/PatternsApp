package com.company.facade;

import com.company.shapes.Shape;

import java.util.List;

public interface ShapeWarehouse {
    void processShapes(List<Shape> inputShapes);
    void showStoredShapes();
}
