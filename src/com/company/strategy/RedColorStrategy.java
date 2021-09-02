package com.company.strategy;

public class RedColorStrategy implements ColorStrategy{

    @Override
    public boolean isForbiddenColor(String color) {
        String forbiddenColor = "Red";
        return color.equalsIgnoreCase(forbiddenColor);
    }
}
