package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.Flipckart;
import com.nt.config.AppConfig; 

public class StrategyDPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Flipckart fpkt = ctx.getBean("fpkt",Flipckart.class);
		String shopping = fpkt.Shopping(new String[] {"Shirt","Jeans","Watch"}, new double[] {1000,1500,700});
		System.out.println(shopping);
		ctx.close();
	}

}
