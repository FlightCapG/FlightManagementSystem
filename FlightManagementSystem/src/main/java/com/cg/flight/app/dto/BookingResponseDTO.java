package com.cg.flight.app.dto;

import lombok.Data;

@Data
public class BookingResponseDTO {

	private String msg;
	
	private long bookingId;

	private double ticketCost;

	private String destination;

}
