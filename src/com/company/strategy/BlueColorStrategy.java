package com.company.strategy;

public class BlueColorStrategy implements ColorStrategy{

    @Override
    public boolean isForbiddenColor(String color) {
        String forbiddenColor = "Blue";
        return color.equalsIgnoreCase(forbiddenColor);
    }
}
