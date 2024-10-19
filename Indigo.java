package com.service;

import com.model.Booking;
import com.model.Flight;

public interface Indigo {
	Booking bookFlight(Flight f);
    void getstatus(Booking b);
}
