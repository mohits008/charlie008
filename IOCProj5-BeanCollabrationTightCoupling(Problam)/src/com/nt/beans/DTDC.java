package com.nt.beans;

import java.util.Date;

public class DTDC {

	public DTDC() {
		System.out.println("DTDC: 0-param constructor");
	}
	
	public void deliver(int oid) {
		System.out.println(oid+" order is delivered to customer on "+new Date()+"by DTDC");
	}
}
