package com.techelevatorPostageCalculator;

public class SPU3 implements DeliveryDriver{
	private double weight;
	private int distance;
	

	public SPU3(double weight, int distance) {
		
		this.weight = weight;
		this.distance = distance;
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
		if("Next Day" != null) {
			rate = (weightInPounds * 0.075) * distance;
		}
	
		return rate;
	}
	


}
