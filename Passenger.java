package com.cg.flight.app.entity;

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
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prnNumber;
	private String passengerName;
	private int passengerAge;
	private String city;
	
	

	public Passenger(long prnNumber, String passengerName, int passengerAge, String city) {
		super();
		this.prnNumber = prnNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.city = city;
	}
	
	

}
