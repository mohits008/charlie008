package com.nt.factory;

import com.nt.compo.CNGEngine;
import com.nt.compo.DieselEngine;
import com.nt.compo.Engine;
import com.nt.compo.PetrolEngine;
import com.nt.compo.Vehicle;

public class VehicleFactory {

	public static  Vehicle   getInstance(String engineType) {
		Vehicle vehicle=null;
		Engine engg=null;
		 //create Dependent class object
		 if(engineType.equalsIgnoreCase("diesel")) {
			 engg=new DieselEngine();
		 }
		 else if(engineType.equalsIgnoreCase("petrol")) {
			 engg=new PetrolEngine();
		 }
		 else if(engineType.equalsIgnoreCase("cng")) {
			 engg=new CNGEngine();
		 }
		 else {
			 throw new IllegalArgumentException("Invalid Engine type");
		 }
		 //create Taget class obj
		 vehicle=new Vehicle();
		 vehicle.setEngg(engg);
		 return vehicle;
	}
}
