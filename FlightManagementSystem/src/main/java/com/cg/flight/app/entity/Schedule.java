package com.cg.flight.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;
	private String sourceAirport;
	private String destinationAirport;
	private String departureDateTime;
	private String arrivalDateTime;
	
	
}
