package com.techelevatorPostageCalculator;

public class SPU1 implements DeliveryDriver {
	private double weight;
	private int distance;
	

	public SPU1(double weight, int distance) {
		
		this.weight = weight;
		this.distance = distance;
	}
	
	public String toString() {
		String formattedRate = String.format( "$%.2f", calculateRate(distance, weight));
		return String.format("%1$-31s %2$s", "SPU (4-Day Ground)", formattedRate);
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
		if("4-Day Ground" != null) {
			rate = (weightInPounds * 0.0050) * distance;
		}
	
		return rate;
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
