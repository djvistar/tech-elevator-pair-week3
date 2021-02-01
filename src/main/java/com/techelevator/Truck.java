package com.techelevator;

public class Truck implements Vehicle{

	
	private int numberOfAxles;
	private int distance;
	
	
	
	//constructor
	
	
	public Truck(int numberOfAxles, int distance) {
		
		this.numberOfAxles = numberOfAxles;
		this.distance = distance;
	}
	
	
	
	
	
	//getter
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	public int getDistance() {
		return distance;
	}

	
//	Axles	Per Mile
//	4	0.040
//	6	0.045
//	8+	0.048
//	toll = rate per mile * distance
	@Override
	public double calculateToll(int distance) {
		
		double ratePerMile = 0.0;
		double toll = ratePerMile *distance;
		 
		if (numberOfAxles < 6) {
			ratePerMile = 0.040;
		}
		else if (numberOfAxles < 8) {
			ratePerMile = 0.045;
		}
		else {
			ratePerMile = 0.048;
		}
		
		return toll;
	}
	
	
	
	

}
