//Spring Bean class(POJO class)
//Target class
package com.mt.beans;

import java.util.Date;

public class WishMsgGenerator {
      
	private Date date;
	static {
		System.out.println("WishMsgGenerator:static block");
	}
	public WishMsgGenerator(){
		System.out.println("WishMsgGenerator::0-param constructor");
	}
   //setter method for setter injection
	public void setDate(Date date) {
		this.date = date;
	}
   //B.method
	@SuppressWarnings("deprecation")
	public String generate(String user) {
		System.out.println("WishMsgGenerator.generate(-)");
		int hour=0;
		//get Current hour of the day
		hour=date.getHours();
		//write message
		if(hour<12)
		 return "Good Morning:("+user;
		else if(hour<16)
		 return "Good After Noon:)"+user;	
		else if(hour<20)
		  return "Good Evening :)"+user;
		else 
		  return "Good Night :)"+user;
	}//generate method	
}//class