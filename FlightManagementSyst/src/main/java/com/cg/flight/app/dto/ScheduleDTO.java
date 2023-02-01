package com.cg.flight.app.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {
	private String arrivalTime;
	private String departureTime;
	private int scheduleFlightId;
	private int avaliableSeats;
	
}
	
	

