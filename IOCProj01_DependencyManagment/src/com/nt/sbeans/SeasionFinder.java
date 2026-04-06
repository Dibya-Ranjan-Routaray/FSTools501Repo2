package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasionFinder {
	LocalDate date;

	public SeasionFinder() {
		super();
	}
    
	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String ShowMessage() {
		int month = date.getMonthValue();
		if(month>=3 && month<=6) {
			return "summer";
		}else if(month>=7 && month<=10) {
			return "rain";
		}else {
			return"winter";
		}
	}
}
