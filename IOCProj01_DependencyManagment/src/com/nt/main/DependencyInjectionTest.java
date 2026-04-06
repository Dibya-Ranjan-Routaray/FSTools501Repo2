package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;


public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()(start)");
		//create IOC container 
		//FileSystemXmlApplicationContext ctx= 
//				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml"); 
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        //ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get target spring bean class obj ref 
        
		//Object obj = ctx.getBean("wmg"); 
		//WishMessageGenerator generator=(WishMessageGenerator) obj; 
		WishMessageGenerator generator2=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b method 
		String msg = generator2.showWishMessage("Dibya"); 
		System.out.println(msg);
		
		//close connection
		Class<Integer> c=Integer.class;
		System.out.println(c);
		ctx.close();
		System.out.println("DependencyInjectionTest.main()()end");

	}

}
