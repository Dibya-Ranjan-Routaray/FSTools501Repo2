package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pinfo")
public class PersionalInfo {
	@Value("${per.id}")
	private Integer id;
	@Value("${per.name}")
	private String name;
	@Value("${per.addres}")
	private String add;
	@Value("${per.phno}")
	private Long phno;
	@Value("false")
	private String gf;
	@Override
	public String toString() {
		return "PersionalInfo [id=" + id + ", name=" + name + ", add=" + add + ", phno=" + phno + ", gf=" + gf + "]";
	}
	
	
}
