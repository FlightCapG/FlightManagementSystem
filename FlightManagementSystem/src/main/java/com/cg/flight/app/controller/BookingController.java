package com.cg.flight.app.controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.dto.BookingDTO;
import com.cg.flight.app.dto.BookingResponseDTO;
import com.cg.flight.app.entity.Booking;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.service.IBookingService;
import com.cg.flight.app.util.BookingDTOConvertor;

@RestController
@RequestMapping("/booking")
public class BookingController {

	private final Logger logger = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	private IBookingService bookingService;

	@Autowired
	private BookingDTOConvertor bookingDTOConvertor;

	public BookingController() {
		logger.info("---Booking Controller Called --");
		logger.warn("---Booking Controller Called --");

		System.err.println("Welcome to Flight Management app");
	}

	List<Booking> bookingList;

	@PostMapping("/register")
	public ResponseEntity<BookingResponseDTO> addBooking(@RequestBody Booking booking) {
		Booking savedBooking = bookingService.addBooking(booking);
		BookingResponseDTO dto = bookingDTOConvertor.getBookingResponseDTO(savedBooking);
		return new ResponseEntity<BookingResponseDTO>(dto, HttpStatus.OK);
	}

	@PutMapping("/modify/{bookingId}")
	public String modifyBooking(@PathVariable int bookingId) {
		Booking modifiedBookings = bookingService.modifyBooking(bookingId);
		return modifiedBookings.toString();
	}

	@GetMapping("/viewBooking/{bookingId}")
	public ResponseEntity<BookingResponseDTO> viewBookingById(@PathVariable int bookingId) {
		Booking allBookings = bookingService.viewBookingById(bookingId);
		BookingResponseDTO dto = bookingDTOConvertor.getBookingResponseDTO(allBookings);
		return new ResponseEntity<BookingResponseDTO>(dto, HttpStatus.OK);

	}
	@GetMapping("/bookingsByDestination/{destination}")
	public ResponseEntity<List<BookingDTO>> viewBookingByDestination(@PathVariable String destination) {
		List<Booking> allBookings = bookingService.viewBookingByDestination(destination);
		List<BookingDTO> allBookingDTO = new ArrayList<>();
		
		for (Booking booking : allBookings ) {
			if (booking.getDestination().equals(destination)) {
				allBookingDTO.add(bookingDTOConvertor.GetBookingDTO(booking));
				return new ResponseEntity<List<BookingDTO>>(allBookingDTO,HttpStatus.OK);
		
			}
		}
		return null;
	}

	
	@GetMapping("/view")
	public ResponseEntity<List<BookingDTO>> viewBooking() throws Exception {
		List<Booking> allBookings = bookingService.viewBooking();
		List<BookingDTO> allBookingDTO = new ArrayList<>();
		if(allBookings!=null && allBookings.isEmpty()==false) {
			
		
		for (Booking booking : allBookings) {
			BookingDTO dto = bookingDTOConvertor.GetBookingDTO(booking);
			allBookingDTO.add(dto);
		}
		}
		return new ResponseEntity<List<BookingDTO>>(allBookingDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteBooking(@PathVariable int id) {
		bookingService.deleteBooking(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	// localhost:2020/Customer/Booking/registerBooking
	// localhost:2020/Customer/modify/
}
