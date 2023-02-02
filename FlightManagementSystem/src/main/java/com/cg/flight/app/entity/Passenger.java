package com.cg.flight.app.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pnrId;
	
	private String passengerName;
	private int passengerAge;
	private String city;
	
	public Passenger(String passengerName, int passengerAge, String city) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.city=city;
	}
	
	

}
