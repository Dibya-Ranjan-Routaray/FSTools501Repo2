package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fpkt")
public class Flipckart {
	@Autowired
	@Qualifier("dtdc")
	private ICourier courier;
	public Flipckart() {
		System.out.println("Flipckart.Flipckart()");
	}
	
	public String Shopping(String[]item,double []price) {
		System.out.println("Flipckart.Shopping()");
		double billAmount=0;
		for(double p:price) {
			billAmount=billAmount+p;
		}
		int oid=new Random().nextInt(1000);
		String msg = courier.deliver(oid);
		return Arrays.toString(item)+" Item with bill amount :"+billAmount+"-----"+msg;
	}
}
