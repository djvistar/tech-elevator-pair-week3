package com.techelevatorPostageCalculator;

public class FexEd implements DeliveryDriver {
	private int distance;
	private double weight;
	

	public FexEd(int distance, double weight) {
		
		this.distance = distance;
		this.weight = weight;
	}
	
	public String toString() {
		String formattedRate = String.format( "$%.2f", calculateRate(distance, weight));
		return String.format("%1$-31s %2$s", "FexEd", formattedRate);
	}

	public int getDistance() {
		return distance;
	}



	public double getWeight() {
		return weight;
	}



	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 20.00;
		if(distance > 500) {
			rate += 5.00;
		}
		if(weight > 48) {
			rate += 3.00;
		}
		return rate;
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
