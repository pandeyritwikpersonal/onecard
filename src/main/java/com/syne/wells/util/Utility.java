package com.syne.wells.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

	public static String getDateOnly(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		return formatter.format(date);
	}
	
	public static String getDateAndTime(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		return formatter.format(date);
	}
	
}
