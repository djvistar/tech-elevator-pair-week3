package com.techelevatorPostageCalculator;

public interface DeliveryDriver {
	String getName();
	
	double calculateRate(int distance, double weight );
	
	//String getName();//

	
}
