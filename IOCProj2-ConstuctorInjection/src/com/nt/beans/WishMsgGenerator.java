package com.nt.beans;

import java.util.Date;

/*public class WishMsgGenerator {
	
	private Date date;
	//private Date date1;
	
	static {
		System.out.println("WishMsgGenerator:static block");
	}

	public WishMsgGenerator(Date date){
		System.out.println("WishMsgGenerator::1-param constructor");
	}
	
	public WishMsgGenerator(Date dat) {
		System.out.println("WishMessageGenerator:paramterized cosntructor");
		this.date = dat;
	}
	
	public WishMsgGenerator(){
		System.out.println("WishMsgGenerator::0-param constructor");
	}
	
	//public void setDate(Date date) {
		this.date = date;
		System.out.println("WishMsgGenerator:setDate(-)");
	}
	
	
	//public void setDate1(Date date) {
		System.out.println("WishMsgGenerator:setDate(-)");
		this.date = date;
	}

	//public void setDate1(Date date) {
		System.out.println("WishMsgGenerator:setDate(-)");
		this.date = date;
	}
	
	
	
	//B.method
		@SuppressWarnings("deprecation")
		public String generate(String user) {
			System.out.println("WishMsgGenerator:generate(-)::"+date);
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
}//class*/

public class WishMsgGenerator {
	
private  Date date;
	
	public WishMsgGenerator(Date date) {
		this.date=date;
		System.out.println("WishMsgGenerator::1-param constructor");
	}
	
	public void setDate(Date date){
		this.date=date;
		System.out.println("WishMsgGenerator::setDate(-) method");
	}

	@SuppressWarnings("deprecation")
	public String generate(String user){
		int hour=0;
		//get current hour of the day
		System.out.println("Injected Date value::"+date);
		hour=date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;	
	}
}
