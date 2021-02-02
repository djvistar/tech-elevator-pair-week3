package com.techelevatorPostageCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

	public static void main(String[] args) {
		List<DeliveryDriver> postageCost = new ArrayList<DeliveryDriver>();
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the weight of the package?");
		double weight = Integer.parseInt(input.nextLine());

		System.out.println("(P)ounds or (O)unces? ");
		String pounds = input.nextLine();

		if (pounds.contentEquals("P")) {
			weight = convertPoundsToOunces(weight);

		}
		System.out.println("What distance will it be travelling? ");
		int distance = Integer.parseInt(input.nextLine());

		PostalService1 postalService1 = new PostalService1(distance, weight);
		PostalService2 postalService2 = new PostalService2(distance, weight);
		PostalService3 postalService3 = new PostalService3(distance, weight);
		FexEd fexEd = new FexEd(distance, weight);
		SPU1 spu1 = new SPU1(weight, distance);
		SPU2 spu2 = new SPU2(weight, distance);
		SPU3 spu3 = new SPU3(weight, distance);

		postageCost.add(postalService1);
		postageCost.add(postalService2);
		postageCost.add(postalService3);
		postageCost.add(fexEd);
		postageCost.add(spu1);
		postageCost.add(spu2);
		postageCost.add(spu3);
		
	    System.out.println("Delivery Method                 $ cost");
	    System.out.println("--------------------------------------");
	    
	    for(DeliveryDriver driver: postageCost) {
	    	System.out.println(driver);
	    }

	}

	private static double convertPoundsToOunces(double weight) {
		// TODO Auto-generated method stub
		return weight * 16;
	}

}
