package com.mt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.mt.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		 BeanFactory factory=null;
		 WishMessageGenerator generator=null;
		//Hold  Spring Bean cfg file
		res=new FileSystemResource("src/com/mt/cfgs/applContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get Target class obj
		generator=(WishMessageGenerator) factory.getBean("wmg");
		//invoke b.method
		System.out.println("Message:::"+generator.sayHello("raja"));
	}

}
