package com.nt.compo;

public class Vehicle {

	private Engine engg;
	
	public Vehicle() {
		System.out.println("Vehicle:0-param constructor");
	}

	public void setEngg(Engine engg) {
		System.out.println("Vehicle.setEngg(-)");
		this.engg = engg;
	}
	
	public  void  journery(String startPlace,String destPlace) {
		engg.start();
		 System.out.println("Vehicle is moving......");
		 engg.stop();
		 System.out.println(startPlace+"  to  "+destPlace +" jounery Completed");
	}//journery()
}//class
