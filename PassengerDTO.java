package com.cg.flight.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDTO {
	
	private long prnNumber;
	private String passengerName;
	private int passengerAge;
	private String city;

}
