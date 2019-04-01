package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.compo.CNGEngine;
import com.nt.compo.DieselEngine;
import com.nt.compo.Engine;
import com.nt.compo.PetrolEngine;
import com.nt.compo.Vehicle;

public class VehicleFactory {
	
    private  static Map<String,Object> cacheMap=new HashMap();
	public static  Vehicle   getInstance(String engineType) {
		
		Vehicle vehicle=null;
		Engine engg=null;
		
		if(!cacheMap.containsKey(engineType)) {
            if(engineType.equalsIgnoreCase("diesel"))
	           engg=new DieselEngine();
             else if(engineType.equalsIgnoreCase("petrol"))
	                   engg=new PetrolEngine();
               else if(engineType.equalsIgnoreCase("cng"))
	               engg=new CNGEngine();
             else
	               throw new IllegalArgumentException("invalid enginetype");
             cacheMap.put(engineType, engg);
             
             if(!cacheMap.containsKey("vehicle")) {
            	 vehicle=new Vehicle();	 
    		     cacheMap.put("vehicle", vehicle);
             }
             else {
            	 vehicle=(Vehicle) cacheMap.get("vehicle");
    		 }
   }//if
   else {
	      engg=(Engine) cacheMap.get(engineType);
       }
	 vehicle.setEngg(engg);
	 return vehicle;
 	}
}//class
