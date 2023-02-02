package com.cg.flight.app.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;

	private Date bookingDate;

	private double ticketCost;

	private int noOfPassengers;

	private String destination;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pnrId",referencedColumnName = "pnrId")
	private Passenger passenger;

	@JoinColumn(name = "flightId",referencedColumnName = "flightId")
	@OneToOne(cascade = CascadeType.ALL)
	private Flight flight;

	public Booking(double ticketCost, int noOfPassengers, String destination) {
		super();

		

		this.ticketCost = ticketCost;

		this.noOfPassengers = noOfPassengers;
		this.destination = destination;
	}

}
