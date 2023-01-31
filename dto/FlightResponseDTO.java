package com.cg.flight.app.dto;

import lombok.Data;

@Data
public class FlightResponseDTO {
	private long flightId;
	private String carrierName;
	private String sourceAirport;
	private String destinationAirport;
	private String duration;
	private int seatCapacity;
	private String msg;

}
