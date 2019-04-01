package com.mt.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI {

	public static void main(String[] args)throws Exception {
		/*@SuppressWarnings("rawtypes")
		Class c=null;
		@SuppressWarnings("rawtypes")
		Constructor cons[]=null;
		Demo d1=null,d2=null;
		//load class
		c=Class.forName("com.mt.test.Demo");
		//get All Constructors
		cons=c.getDeclaredConstructors();
		//get access to private Constructors
		cons[0].setAccessible(true);
		cons[1].setAccessible(true);
		//create objs
		d1=(Demo)cons[0].newInstance(10,20);
		System.out.println("sum::"+d1.sum(100,200));
		System.out.println("=============");
		d2=(Demo)cons[1].newInstance();
		System.out.println("sum::"+d2.sum(10,20));
*/
		Class c=null;
		Constructor cons[]=null;
		Demo d1=null,d2=null;
		//Load the class
		c=Class.forName("com.nt.test.Demo");
		//get All constructors
		cons=c.getDeclaredConstructors();
		//get Access to private Constructors
		cons[0].setAccessible(true);
		cons[1].setAccessible(true);
		//create objects
		d1=(Demo) cons[0].newInstance(10,20);
		System.out.println("sum::"+d1.sum(100,200));
		System.out.println("======================");
		d2=(Demo) cons[1].newInstance();
		System.out.println("sum::"+d2.sum(10,20));
	}//main
}//class
