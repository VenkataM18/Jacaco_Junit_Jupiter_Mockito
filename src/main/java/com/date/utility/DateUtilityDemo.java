package com.date.utility;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtilityDemo {
	
	private static DateTimeFormatter FOMATTER_MM_dd_yyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private static DateTimeFormatter FOMATTER_hh_mm_a = DateTimeFormatter.ofPattern("hh:mm a");
	
	public static String dateFormatter(){
		return FOMATTER_MM_dd_yyyy.format(LocalDate.now());
	}
	
	public static String dateTimeFormatter(){
		return FOMATTER_hh_mm_a.format(LocalTime.now());
	}
	
	/*public static void main(String args[]){
		
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		DateFormatter inBuiltFormatter3 = new DateFormatter();
		inBuiltFormatter3.setPattern("MM/dd/yyyy");
		DateFormatter inBuiltFormatter4 = new DateFormatter();
		inBuiltFormatter4.setPattern("yyyy-MM-dd");
		
		DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter inBuiltFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		//Get formatted String
		String ldtString = inBuiltFormatter1.format(localDateTime);
		System.out.println("ISO_DATE_TIME:-"+ldtString);
		System.out.println("ISO_LOCAL_DATE_TIME:-"+inBuiltFormatter2.format(localDateTime));
		
		//System.out.println("localDate:-"+localDate.parse("01/16/2021"));
		
		DateTimeFormatter FOMATTER1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate stringToDate = LocalDate.parse("01/16/2021", FOMATTER1);
		System.out.println("stringToDate:-"+stringToDate);
		
	
	System.out.println(dateFormatter());
	System.out.println(dateTimeFormatter());
	
	}*/
	
	/**
	 *  PATTERN	EXAMPLE
		yyyy-MM-dd (ISO)	“2018-07-14”
		dd-MMM-yyyy	“14-Jul-2018”
		dd/MM/yyyy	“14/07/2018”
		E, MMM dd yyyy	“Sat, Jul 14 2018”
		h:mm a	“12:08 PM”
		EEEE, MMM dd, yyyy HH:mm:ss a	“Saturday, Jul 14, 2018 14:31:06 PM”
		yyyy-MM-dd'T'HH:mm:ssZ	“2018-07-14T14:31:30+0530”
		hh 'o''clock' a, zzzz	“12 o’clock PM, Pacific Daylight Time”
		K:mm a, z	“0:08 PM, PDT”
	 * 
	 * 
	 */

}
