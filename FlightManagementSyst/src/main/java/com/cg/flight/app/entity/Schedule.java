package com.cg.flight.app.entity;
import javax.persistence.*;
import java.util.*;


@Entity
public class Schedule {
	@Id
	@Column(name= "scheduledId")
	private int schedule;

	
	@OneToOne(fetch = FetchType.EAGER,cascade= CascadeType.ALL)
	@JoinColumn(name="sourceAirport")
	private Airport sourceAirport;
	
	@OneToOne(fetch = FetchType.EAGER,cascade= CascadeType.ALL)
	@JoinColumn(name="destinationAirport")
	private Airport destinationAirport;
	
	private String arrivalTime;
	private String departureTime;
	
	public int getSchedule() {
		return schedule;
	}
	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
		
	}
	public Airport getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
		
	}
	public Airport getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	
	
	

}
