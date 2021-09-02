package com.company;

import com.company.facade.BlueSquareWarehouse;
import com.company.facade.ShapeWarehouse;
import com.company.factories.ShapeFactory;
import com.company.factories.SquareShapeFactory;
import com.company.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int AMOUNT_OF_SHAPES_TO_CREATE = 100;

    public static void main(String[] args) {
        ShapeWarehouse warehouse = new BlueSquareWarehouse();
        warehouse.processShapes(produceListOfShapes(new SquareShapeFactory()));
        warehouse.showStoredShapes();

    }

    static List<Shape> produceListOfShapes(ShapeFactory factory) {
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_SHAPES_TO_CREATE; i++) {
            shapes.add(factory.createShape());
        }
        return shapes;
    }
}
