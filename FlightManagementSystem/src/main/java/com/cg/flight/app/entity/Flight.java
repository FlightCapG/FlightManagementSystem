package com.cg.flight.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private String carrierName;
	private String sourceAirport;
	private String destinationAirport;
	private String duration;
	private int seatCapacity;

	@OneToOne
	private Schedule schedule;

	public Flight(int flightId, String carrierName, String sourceAirport, String destinationAirport, String duration,
			int seatCapacity) {
		super();
		this.flightId = flightId;
		this.carrierName = carrierName;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.duration = duration;
		this.seatCapacity = seatCapacity;
	}
}
