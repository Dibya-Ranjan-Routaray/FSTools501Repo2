package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasionFinder;

public class DependencyInjectionTest2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext2.xml");
		SeasionFinder bean = ctx.getBean("sf",SeasionFinder.class);
		String showMessage = bean.ShowMessage();
		System.out.println(showMessage);
		ctx.close();
	}
}
