package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main (String[] args) {
		
		List<Vehicle>vehicleToll = new ArrayList<Vehicle>();
		
		Car car = new Car(false, 100);
		Car carWithTrailer = new Car(true, 75);
		Tank tank = new Tank();
		tank.calculateToll(240);
		Truck truck1 = new Truck(150, 4);
		Truck truck2 = new Truck(101, 6);
		Truck truck3 = new Truck(180, 8);
		
		
		
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
