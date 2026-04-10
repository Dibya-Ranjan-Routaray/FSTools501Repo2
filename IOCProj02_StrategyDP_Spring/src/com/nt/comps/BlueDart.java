package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourier{

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return null;
	}

}
