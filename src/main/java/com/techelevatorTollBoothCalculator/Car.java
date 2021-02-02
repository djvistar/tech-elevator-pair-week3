package com.techelevatorTollBoothCalculator;

public class Car implements Vehicle {
	
	
	
	private boolean hasTrailer;
	private int distance;
	
	
	//constructor
	
	public Car(boolean hasTrailer, int distance) {
		
		this.hasTrailer = hasTrailer;
		this.distance = distance;
	}
	
	
	public String toString() {
		String formattedToll = String.format("$%.2f", calculateToll(distance));
		
		return String.format("%1$-16s %2$-22s %3$s",  "Car", distance, formattedToll);
	}
		
	
	
	
	
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
		
		double toll = 0.020* distance;
		if (hasTrailer) {
			toll +=1.00;
		}
		
		return toll;
	}



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
