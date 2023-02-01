package com.cg.flight.app.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {

	private int bookingId;

	private double ticketCost;

	private String destination;

}
