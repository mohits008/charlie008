package com.nt.test;

import com.nt.compo.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		Vehicle vehicle=null,vehicle1=null;
		//Get Vehicle object
		vehicle=VehicleFactory.getInstance("diesel");
		vehicle.journery("hyderabad", "banguluru");
		System.out.println("=========================");
		vehicle1=VehicleFactory.getInstance("petrol");
		vehicle1.journery("Kundanhalli","Prakenhara");
	}
}
