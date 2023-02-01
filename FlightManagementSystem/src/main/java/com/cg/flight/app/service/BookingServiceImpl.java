package com.cg.flight.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Booking;
import com.cg.flight.app.exception.BookingNotFoundException;
import com.cg.flight.app.repository.IBookingRepository;

@Service
public class BookingServiceImpl implements IBookingService {

	@Autowired
	IBookingRepository bookingRepository;

	@Override
	public Booking addBooking(Booking booking) {

		return bookingRepository.save(booking);
	}



	@Override
	public Booking viewBookingById(int bookingId) {

		return bookingRepository.getReferenceById(bookingId);
	}

	@Override
	public List<Booking> viewBooking() {
		return bookingRepository.findAll();
	}

	@Override
	public void deleteBooking(int bookingId) {
		if (!bookingRepository.existsById(bookingId)) {
			throw new BookingNotFoundException("Booking with this " + bookingId + "Not Found");
		}
		bookingRepository.deleteById(bookingId);
	}

	@Override
	public Booking modifyBooking(int bookingId) {
		// TODO Auto-generated method stub
		return bookingRepository.getReferenceById(bookingId);
	}



	@Override
	public List<Booking> viewBookingByDestination(String destination) {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

}
