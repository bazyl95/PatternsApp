package com.company.strategy;

public class GreenColorStrategy implements ColorStrategy{

    @Override
    public boolean isForbiddenColor(String color) {
        String forbiddenColor = "Green";
        return color.equalsIgnoreCase(forbiddenColor);
    }
}
