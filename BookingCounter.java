package com.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.Booking;
import com.model.Flight;

public class BookingCounter implements Indigo {
    Scanner s = new Scanner(System.in);
    Random random = new Random();
    List<Booking> bookingList = new ArrayList<>(); 

    @Override
    public Booking bookFlight(Flight f) {
        System.out.println("Enter the number of seats to book:");
        int noOfSeats = s.nextInt();
        
        float totalbookingAmt = noOfSeats*f.getticketPrice();
        LocalDateTime bookingTime = LocalDateTime.now();
        int bookingId = random.nextInt(100);
        
        Booking b = new Booking(bookingId, bookingTime, noOfSeats, f, totalbookingAmt);
        
        bookingList.add(b); // Add the new booking to the list
        
        System.out.println("Booking Sucessfull...");
        return b;
}
    
    public void getstatus(Booking b) {
    	System.out.println("Booking Details...");
    	System.out.println("Booking ID: " + b.getBookingId());
    	System.out.println("Booking Time: " + b.getBookingTime());
    	System.out.println("Flight from: " + b.getF().getFrom());
    	System.out.println("Flight to: " + b.getF().getTo());
    	System.out.println("Flight Date and Time: " + b.getF().getDt());
    	System.out.println("No of Seats: " + b.getNoOfSeats());
    	System.out.println("Total Amount: " + b.getBookingAmt());
    }
    public void sortBookingsByTime() {
    	bookingList.sort(Comparator.comparing(Booking::getBookingTime));
    	System.out.println("Bookings sorted by Time: ");
    	printAllBookings();
    }
    public void sortBookingByAmount() {
    	bookingList.sort(Comparator.comparing(Booking::getBookingAmt));
    	System.out.println("Bookings sorted by Amount: ");
    	printAllBookings();
    }
    public void printAllBookings() {
    	for(Booking b : bookingList) {
    		getstatus(b);
    	}
    }
}
