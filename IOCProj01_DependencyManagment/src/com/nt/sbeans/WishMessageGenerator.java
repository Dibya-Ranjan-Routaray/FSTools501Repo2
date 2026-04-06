package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime time;//HAS-A Relation
	private int age;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	//Setter method for setter Injection
	
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}

	//b.method having b.logic
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()"+time+"...."+age);
		//get current hour
		int hour=time.getHour();//24 hour format
		
		//Write logic to generate the wish message
		if(hour<12) {
			return"Good Morning "+user;
		}else if (hour<16) {
			return"Good AfterNoon "+user;
		}else if (hour<20) {
			return"Good Evening "+user;
		}else 
			return"Good Evening "+user;
	}
	
}
