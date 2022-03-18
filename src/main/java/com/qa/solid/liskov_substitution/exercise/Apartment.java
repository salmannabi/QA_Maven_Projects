package com.qa.solid.liskov_substitution.exercise;

public abstract class Apartment {
    private int squareFootage;
    private int numberOfBedrooms;

    public abstract void setSquareFootage(int sqft);

    public int getSquareFootage() {
        return squareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public abstract void setNumberOfBedrooms(int numberOfBedrooms);
}
