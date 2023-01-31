package com.cg.flight.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor

public class Airport {
	
	private int airportCode;
	private String airportName;
	private String airportLocation;
	
}
