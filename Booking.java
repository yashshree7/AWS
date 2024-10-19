package com.model;

import java.time.LocalDateTime;

public class Booking {
	private int bookingId;
	private LocalDateTime bookingTime;
	private int noOfSeats;
	private Flight f;
	private float bookingAmt;
	
	//Constructor with parameters
    public Booking(int bookingId, LocalDateTime bookingTime, int noOfSeats, Flight Flight, float bookingAmt) {
        this.bookingId = bookingId;
        this.bookingTime = bookingTime;
        this.noOfSeats = noOfSeats;
        this.f = Flight;
        this.bookingAmt = bookingAmt;
    }
    
	//getter and setter methods
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public Flight getF() {
		return f;
	}
	public void setF(Flight f) {
		this.f = f;
	}
	public float getBookingAmt() {
		return bookingAmt;
	}
	public void setBookingAmt(float bookingAmt) {
		this.bookingAmt = bookingAmt;
	}
}
