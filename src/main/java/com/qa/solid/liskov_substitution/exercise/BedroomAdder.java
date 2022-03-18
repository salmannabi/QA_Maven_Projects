package com.qa.solid.liskov_substitution.exercise;

public class BedroomAdder {
	public void addBedroom(Apartment apartment) {
        apartment.setSquareFootage(apartment.getSquareFootage() + 40);

        apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
    }
}
