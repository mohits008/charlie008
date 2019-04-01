package com.mt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.mt.beans.WishMsgGenerator;

@SuppressWarnings("deprecation")
public class TestApp {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("start of main(-) method");
		Resource res=null;
		BeanFactory factory=null;
		Object obj1=null;
		WishMsgGenerator generator=null;
		
		//Hold  Spring Bean cfg file
		res=new FileSystemResource("src/com/mt/cfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get Target Bean Class Object
		obj1=factory.getBean("wmg");
		//Type Casting
		generator=(WishMsgGenerator)obj1;
		//invoke b.method
		System.out.println("Wish message::"+generator.generate("M.K.T."));
		System.out.println("end of main(-) method");
	}//main
}//class