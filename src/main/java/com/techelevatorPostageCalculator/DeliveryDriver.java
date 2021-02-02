package com.techelevatorPostageCalculator;

public interface DeliveryDriver {
	String name = null;
	
	double calculateRate(int distance, double weight );
	
	//String getName();//

	
}
