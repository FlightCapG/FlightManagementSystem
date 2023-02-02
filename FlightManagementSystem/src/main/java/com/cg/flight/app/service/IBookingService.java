package com.cg.flight.app.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Booking;



@Service
public interface IBookingService {
	
	

	public Booking addBooking(Booking booking)throws Exception ;
	
	public Booking viewBookingById(int bookingId);
	
	public List<Booking> viewBookingByDestination(String destination);
	
	public List<Booking> viewBooking() ;
	
	//public List<Booking> viewBookingByFlightCost(int ticketCost);
	
	public void deleteBooking(int bookingId) ;
	
	public Booking modifyBooking(int bookingId);
	
}




