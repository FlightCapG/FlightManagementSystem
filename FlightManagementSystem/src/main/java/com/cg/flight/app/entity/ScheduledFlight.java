package com.cg.flight.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ScheduledFlight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleFlightId;
	private int availableSeats;
	private float ticketCost;

	public ScheduledFlight(int scheduleFlightId, int availableSeats, float ticketCost) {
		super();
		this.scheduleFlightId = scheduleFlightId;
		this.availableSeats = availableSeats;
		this.ticketCost = ticketCost;
	}
}
