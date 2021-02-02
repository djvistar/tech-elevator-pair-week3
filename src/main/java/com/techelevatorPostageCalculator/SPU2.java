package com.techelevatorPostageCalculator;

public class SPU2 implements DeliveryDriver {
	private double weight;
	private int distance;
	

	public SPU2(double weight, int distance) {
		
		this.weight = weight;
		this.distance = distance;
	}
	

	public String toString() {
		String formattedRate = String.format( "$%.2f", calculateRate(distance, weight));
		return String.format("%1$-31s %2$s", "SPU (2-Day Business)", formattedRate);
	}
	
	
	
	

	public double getWeight() {
		return weight;
	}



	public int getDistance() {
		return distance;
	}



	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		double weightInPounds = weight/16;
		if("2-Day Business" != null) {
			rate = (weightInPounds * 0.050) * distance;
		}
	
		return rate;
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
