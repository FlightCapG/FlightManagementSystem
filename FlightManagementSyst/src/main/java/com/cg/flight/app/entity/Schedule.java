package com.cg.flight.app.entity;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;
	private int availableseat;
	private String arrivalTime;
	private String departureTime;
	public Schedule(int availableseat, String arrivalTime, String departureTime) {
		super();
		this.availableseat = availableseat;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	
	

}
