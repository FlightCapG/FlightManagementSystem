package com.cg.flight.app.entity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //
	private int flightId;
	private String carrierName;
	private String sourceAirport;
	private String destinationAirport;
	private String duration;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "flightInfo")
	private List<FlightReview> allReviews;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "schduleId")
	private Schedule schedule;
	public Flight(String carrierName, String sourceAirport, String destinationAirport, String duration) {
	super();
	this.carrierName = carrierName;
	this.sourceAirport = sourceAirport;
	this.destinationAirport = destinationAirport;
	}
	}



