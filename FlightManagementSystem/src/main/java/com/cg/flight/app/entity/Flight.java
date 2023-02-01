package com.cg.flight.app.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long flightId;
	private String carrierName;
	private int seatCapacity;
	private double duration;
	private String sourceAirport;
	
	private String destinationAirport;

	public Flight(String carrierName, int seatCapacity, double duration, String sourceAirport,
			String destinationAirport) {
		super();
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
		this.duration = duration;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
	}
	
	
	

}
