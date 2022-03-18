package com.qa.solid.openclosed;

public class AreaCalculator {
    public double calculateAreaRectangle(Rectangle rect){
        return rect.getLength() * rect.getWidth();
    }
}
