package com.techelevatorTollBoothCalculator;

public class Tank implements Vehicle {

	
	
	private int distance;
	
	
	
public Tank( int distance) {
	
		this.distance = distance;
	}
	
	
	//getter
	
	public int getDistance() {
		return distance;
	}
	
	
	public String toString() {
		String formattedToll = String.format("$%.2f", calculateToll(distance));
		
		return String.format("%1$-16s %2$-22s %3$s", "Tank", distance, formattedToll);
	}
	
	
	
	
	

	@Override
	public double calculateToll(int distance) {
		
		
		return 0.0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
