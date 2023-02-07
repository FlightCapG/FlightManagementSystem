package com.cg.flight.app.util;

import org.springframework.stereotype.Component;
import com.cg.flight.app.dto.BookingDTO;
import com.cg.flight.app.dto.BookingResponseDTO;
import com.cg.flight.app.entity.Booking;
@Component
public class BookingDTOConvertor {
public BookingResponseDTO getBookingResponseDTO(Booking booking) {
BookingResponseDTO dto = new BookingResponseDTO();
dto.setBookingId(booking.getBookingId());
dto.setNoOfPassengers(booking.getNoOfPassengers());
dto.setTicketCost(booking.getTicketCost());
dto.setDestination(booking.getDestination());
dto.setMsg("Booking done");
return dto;
}
public BookingDTO GetBookingDTO(Booking booking) {
return new BookingDTO(booking.getBookingId(),booking.getNoOfPassengers(),booking.getTicketCost(),booking.getDestination());
}
}
