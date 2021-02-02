package com.techelevatorTollBoothCalculator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {
	
	
		
	
	public static void main (String[] args) {
		
		List<Vehicle>vehicleToll = new ArrayList<Vehicle>();
		
		Car car = new Car(false, 100);
		Car carWithTrailer = new Car(true, 75);
		Tank tank = new Tank(240);
		Truck truck1 = new Truck(4, 150);
		Truck truck2 = new Truck(6, 101);
		Truck truck3 = new Truck(8, 180);
		
		
		
		vehicleToll.add(car);
		vehicleToll.add(carWithTrailer);
	    vehicleToll.add(tank);
		vehicleToll.add(truck1);
		vehicleToll.add(truck2);
		vehicleToll.add(truck3);
		
		
		System.out.println("Vehicle            Distance Traveled      Toll $");
		System.out.println("------------------------------------------------");
		
		
		
		
		for (Vehicle vehicle : vehicleToll) {
			System.out.println(vehicle);
		}
	
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
