package com.techelevatorTollBoothCalculator;

public class Truck implements Vehicle{

	
	private int numberOfAxles;
	private int distance;
	
	
	
	//constructor
	
	
	public Truck(int numberOfAxles, int distance) {
		
		this.numberOfAxles = numberOfAxles;
		this.distance = distance;
	}
	
	
	
	
	public String toString() {
		String formattedToll = String.format("$%.2f", calculateToll(distance));
		
		return String.format("%1$-16s %2$-22s %3$s", "Truck", distance, formattedToll);
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
		//double toll = ratePerMile *distance;
		 
		if (numberOfAxles < 6) {
			ratePerMile = 0.040;
		}
		else if (numberOfAxles < 8) {
			ratePerMile = 0.045;
		}
		else {
			ratePerMile = 0.048;
		}
		
		return ratePerMile *distance;
	}


	



	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
