package com.company.facade;

import com.company.chain_of_responsibility.ShapeColorHandler;
import com.company.chain_of_responsibility.ShapeHandler;
import com.company.chain_of_responsibility.ShapeSquareTypeHandler;
import com.company.shapes.Shape;
import com.company.strategy.BlueColorStrategy;

import java.util.ArrayList;
import java.util.List;

public class BlueSquareWarehouse implements ShapeWarehouse {

    private final ShapeIdDecorator idDecorator;
    private final List<Shape> storedShapes;
    private final ShapeHandler shapeHandler;

    public BlueSquareWarehouse() {
        idDecorator = new ShapeIdDecorator();
        storedShapes = new ArrayList<>();
        shapeHandler = new ShapeColorHandler(new BlueColorStrategy());
        shapeHandler.addHandler(new ShapeSquareTypeHandler());
    }

    @Override
    public void processShapes(List<Shape> inputShapes) {
        for (Shape shape : inputShapes) {
            if (checkForValidity(shape)) {
                storedShapes.add(decorateShapeWithId(shape));
            }
        }
    }

    @Override
    public void showStoredShapes() {
        storedShapes.forEach(System.out::println);
    }

    private Shape decorateShapeWithId(Shape shapeForDecoration) {
        return idDecorator.createShapeWithId(shapeForDecoration);
    }

    private boolean checkForValidity(Shape shape) {
        return shapeHandler.isShapeValid(shape);
    }
}
