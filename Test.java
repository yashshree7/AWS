package com.user;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.model.Booking;
import com.model.Flight;
import com.service.BookingCounter;

public class Test {
		
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		BookingCounter bookingCounter = new BookingCounter(); // Create an instance of BookingCounter
		
		System.out.println("Enter Flight Details: ");
		System.out.println("Flight id: ");
		int flightId = s.nextInt();
		
		System.out.println("From: ");
		String from = s.next();
		
		System.out.println("To: ");
		String to = s.next();
		
		System.out.println("Enter Date and Time (YYYY-MM-DDTHH:MM): ");
		String dateTime = s.next();
		LocalDateTime dateTimeLocalDateTime = LocalDateTime.parse(dateTime);
		
		System.out.println("Enter Ticket Price: ");
		float tp = s.nextFloat();
		
		Flight flight = new Flight(flightId, from, to, dateTimeLocalDateTime, tp);
		
		// Create multiple bookings to test sorting
		for (int i = 0; i < 3; i++) {
			Booking booking = bookingCounter.bookFlight(flight); // Call bookFlight through the instance
		}
		
		// Sort bookings by time and display
		System.out.println("Sorting by time:");
		bookingCounter.sortBookingsByTime(); // Call sortBookingsByTime through the instance
		
		// Sort bookings by amount and display
		System.out.println("Sorting by amount:");
		bookingCounter.sortBookingByAmount(); // Call sortBookingsByAmount through the instance
	}
}


























































































//package com.user;
//
//import java.io.IOException;
//import java.time.LocalDateTime;
//
//import java.util.Scanner;
//
//import com.model.Booking;
//import com.model.Flight;
//import com.service.BookingCounter;
//
//public class Test {
//		
//	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		Booking bookFlight=null;
//		BookingCounter book=new BookingCounter();
//		
//		System.out.println("Enter Flight Details: ");
//		System.out.println("Flight id: ");
//		int flightId = s.nextInt();
//		
//		System.out.println("From: ");
//		String from = s.next();
//		
//		System.out.println("To: ");
//		String to = s.next();
//		
//		System.out.println("Enter Date and Time(YYYY-MM-DDTHH:MM): ");
//		String dateTime = s.next();
//		LocalDateTime dateTimLocalDateTime = LocalDateTime.parse(dateTime);
//		
//		System.out.println(" Enter Ticket Price: ");
//		float tp = s.nextFloat();
//		
//		
//		 Flight flight = new Flight(flightId, from, to, dateTimLocalDateTime, tp);
//		 
//		 //create multiple bookings to test sorting
//		 for(int i=1; i<3; i++) {
//			 Booking booking = BookingCounter.bookFlight(flight);
//		 }
//		 
//		 //Sorting by Time and display
//		 System.out.println("Sorting by Time: ");
//		 BookingCounter.sortBookingsByTime();
//		 
//		 //Sorting by Amount and display
//		 System.out.println("Sorting by Amount: ");
//		 BookingCounter.sortBookingsByAmount();
//		 
//		
//		 BookingCounter bookingCounter = new BookingCounter();
//	     Booking booking = bookingCounter.bookFlight(flight);
//
//	     bookingCounter.getstatus(booking);
//	}
//}
