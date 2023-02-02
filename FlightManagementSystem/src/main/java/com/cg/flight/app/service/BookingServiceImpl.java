package com.cg.flight.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Booking;
import com.cg.flight.app.exceptions.InvalidBookingException;
import com.cg.flight.app.repository.IBookingRepository;

@Service
public class BookingServiceImpl implements IBookingService {

	@Autowired
	IBookingRepository bookingRepository;

	// To Do the booking
	@Override
	public Booking addBooking(Booking booking) throws Exception {

		if (booking.getDestination().equals("")) {
			throw new InvalidBookingException("Destination Not Found");

		} else

			return bookingRepository.save(booking);
	}

	// To get the bookings by Id
	@Override
	public Booking viewBookingById(int bookingId) {

		return bookingRepository.getReferenceById(bookingId);
	}

	// To get all the bookings
	@Override
	public List<Booking> viewBooking() {
		// List<Booking> list = bookingRepository.findAll();
		// if (list.isEmpty())
		// throw new BookingNotFoundException("No search Bookings");
		return bookingRepository.findAll();

		// return bookingRepository.findAll();
	}

	// Delete booking by bookingId
	@Override
	public void deleteBooking(int bookingId) {

		// if (!bookingRepository.existsById(bookingId)) {
		// throw new BookingNotFoundException("Booking with this " + bookingId + "Not
		// Found");
		// }

		bookingRepository.deleteById(bookingId);
	}

	//
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
