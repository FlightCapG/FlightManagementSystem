package com.cg.flight.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightReviewResponseDTO {

	private int flightId;
	private int numberOfStars;
	private String content;

}// end of class
