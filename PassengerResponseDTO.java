package com.cg.flight.app.dto;

import lombok.Data;

@Data
public class PassengerResponseDTO {
	
	private String msg;
	private long prnNumber;
	private String passengerName;
	private int passengerAge;
	private String city;

}
