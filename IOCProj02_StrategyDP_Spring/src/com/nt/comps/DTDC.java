package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier{

	public DTDC() {
		super();
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+"Order items are kept for deliver by DTDC";
	}

}
