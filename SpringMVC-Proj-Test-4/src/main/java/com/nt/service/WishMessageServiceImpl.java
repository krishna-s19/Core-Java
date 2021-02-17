package com.nt.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWishMessage() {
		// get System Date and  time  
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
		return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good evening";
		else 
			return "Good Night";
	}

}
