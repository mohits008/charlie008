package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

/*@SuppressWarnings("deprecation")
public class ConstructorInjectionTest {
      public static void main(String[] args)throws Exception {
      System.out.println("start of main(-) method");
    	        Resource res=null;
    	 		BeanFactory factory=null;
    	 		//Object obj1=null;
    	 		WishMsgGenerator generator=null;
    			

    	 		//Hold spring bean cfg file
    			 //res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
    	 		res=new ClassPathResource("applicationContext.xml");
    	 		//create IOC container
    			//factory=new XmlBeanFactory(res);
    			//factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
    	 		//factory=new XmlBeanFactory(new FileSystemResource("D:\\NTSP711\\IOCProj2-ConstructorInjection\\src\\com\\nt\\cfgs\\applicationContext.xml"));
    	 		 //get Target Bean Class Object
    	 		 factory=new XmlBeanFactory(res);
    			//Type Casting
    			generator=(WishMsgGenerator)factory.getBean("wmg");
    			//invoke b.method
    			System.out.println("Wish message::"+generator.generate("M.K.T."));
    			System.out.println("end of main(-) method");
	}
}*/
@SuppressWarnings("deprecation")
public class ConstructorInjectionTest {
	public static void main(String[] args) {
		System.out.println("main(-)");
		Resource res=null;
		BeanFactory factory=null;
		WishMsgGenerator generator=null;
		//Object obj=null;
		//Locate SpringBean cfg file
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//res=new FileSystemResource("D:/NTSP711/IOCProj2-ConstructorInjection/src/com/nt/cfgs/applicationContext.xml");
		//res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		res=new ClassPathResource("applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		/*//get Bean
		obj=factory.getBean("wish");
		//typecasting
		generator=(WishMessageGenerator)obj;*/
		generator=factory.getBean("wish",WishMsgGenerator.class);
		//invoke the method
		System.out.println("Result==="+generator.generate("raja"));
		System.out.println("end of main(-)");
	}//main
}//class
