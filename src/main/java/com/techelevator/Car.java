package com.techelevator;

public class Car implements Vehicle {
	
	
	
	private boolean hasTrailer;
	private int distance;
	
	
	//constructor
	
	public Car(boolean hasTrailer, int distance) {
		
		this.hasTrailer = hasTrailer;
		this.distance = distance;
	}
//	
//	toll = distance * 0.020
//			if pulling a trailer then toll = toll + 1.00
	
	

//getters
	
	public boolean isHasTrailer() {
		return hasTrailer;
	}


	public int getDistance() {
		return distance;
	}

//method

	@Override
	public double calculateToll(int distance) {
		
		double toll = distance *0.020;
		if (hasTrailer) {
			toll +=1.00;
		}
		
		return toll;
	}

}
