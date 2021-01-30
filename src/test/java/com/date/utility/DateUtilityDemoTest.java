package com.date.utility;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.junit.Test;

import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotNull;



public class DateUtilityDemoTest {

	DateUtilityDemo dateUtilityDemo = new DateUtilityDemo();
	
	@Test
	public void dateFormatterTest() {
		//DateUtilityDemo.dateFormatter();
		assertFalse(DateUtilityDemo.dateFormatter().isEmpty());
	}
	
	@Test
	public void dateTimeFormatter() {
		assertNotNull(DateUtilityDemo.dateTimeFormatter());
	}

}
