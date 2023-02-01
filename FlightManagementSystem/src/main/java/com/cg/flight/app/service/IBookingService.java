package com.cg.flight.app.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Booking;


@Service
public interface IBookingService {
	
	

	public Booking addBooking(Booking booking);
	
	public Booking viewBookingById(int bookingId);
	public List<Booking> viewBookingByDestination(String destination);
	public List<Booking> viewBooking() throws Exception;
	public void deleteBooking(int bookingId);
	public Booking modifyBooking(int bookingId);
	
}




