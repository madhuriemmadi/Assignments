package com.example.Java8Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

	public static void main(String[] args) {
		 LocalDate currentLocalDate = LocalDate.now();
		    System.out.println("currentLocalDate - yyyy-MM-dd - " + currentLocalDate);

		    // Month now not based on 0, and year not based on 1900
		    LocalDate Jun15LocalDate = LocalDate.of(2020, 6, 15);
		    System.out.println("Jun15LocalDate - yyyy-MM-dd - " + Jun15LocalDate);

		    Jun15LocalDate = Jun15LocalDate.withYear(2020).withMonth(12).withDayOfMonth(25);
		    System.out.println("Jun15LocalDate - with -  " + Jun15LocalDate);

		    LocalDate parseJun15LocalDate = LocalDate.parse("2020-06-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		    System.out.println("parseJun15LocalDate - pattern - yyyy-MM-dd - " + parseJun15LocalDate);
		    
		    // increment using plus, decrement using minus
		    Jun15LocalDate = Jun15LocalDate.plusDays(1);
		    System.out.println("Jun15LocalDate - " + Jun15LocalDate);
		    
		    Jun15LocalDate = Jun15LocalDate.minusMonths(2);
		    System.out.println("Jun15LocalDate - " + Jun15LocalDate);
		    // Time with no date
		    LocalTime currentLocalTime = LocalTime.now();
		    System.out.println("currentLocalTime - yyyy-MM-dd - " + currentLocalTime);
		    
		    LocalTime parseLocalTime = LocalTime.parse("13:44");
		    System.out.println("parseLocalTime - " + parseLocalTime);

		    parseLocalTime = LocalTime.parse("13:44:25");
		    System.out.println("parseLocalTime - immutable - " + parseLocalTime);
		    
		    LocalDateTime currentLocalDateTime = LocalDateTime.now();
			System.out.println("currentLocalDateTime " + currentLocalDateTime);		

			currentLocalDateTime = LocalDateTime.parse("2020-06-15T23:53:00.123");
			System.out.println("currentLocalDateTime - parse -  " + currentLocalDateTime);

			currentLocalDateTime = currentLocalDateTime.minusYears(10);
			System.out.println("currentLocalDateTime - minus 10 years -  " + currentLocalDateTime);
	}

}
