package com.qa.solid.liskov_substitution.exercise;

public class Penthouse extends Apartment {
	int squareFootage;
	int numBedrooms;

	@Override
	public void setSquareFootage(int sqft) {
		// TODO Auto-generated method stub
		this.squareFootage = sqft;
	}

	@Override
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		// TODO Auto-generated method stub
		this.numBedrooms += numberOfBedrooms;
	}

}
