package com.cg.flight.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
	private long flightNumber;
	private String carrierName;
	private int seatCapacity;
	private String sourceAirport;
	private String destinationAirport;
	private String duration;
	


}
