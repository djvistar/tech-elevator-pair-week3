package com.techelevatorPostageCalculator;

public class PostalService1 implements DeliveryDriver {
	private int distance;
	private double weight;
	
	public PostalService1(int distance, double weight) {
		
		this.distance = distance;
		this.weight = weight;
		
		
	}
	
	public String toString() {
		String formattedRate = String.format( "$%.2f", calculateRate(distance, weight));
		return String.format("%1$-31s %2$s", "Postage Service (1st Class)", formattedRate);
	}

	public int getDistance() {
		return distance;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		// double ratePerMile = 0;//
		if (weight <= 2) {
			rate = 0.035 * distance;
		} else if (weight <= 8) {
			rate = 0.040 * distance;
		} else if (weight <= 15) {
			rate = 0.047 * distance;
		} else if (weight <= 16) {
			rate = 0.195 * distance;
		} else if (weight <= 128) {
			rate = 0.450 * distance;
		} else {
			rate = 0.500 * distance;
		}

		return rate;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
