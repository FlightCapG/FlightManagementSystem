package com.cg.flight.app.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.flight.app.dto.FlightReviewResponseDTO;
import com.cg.flight.app.entity.FlightReview;

@Component
public class FlightReviewDTOConvertor {

	public FlightReviewResponseDTO convertTo(FlightReview flightReview) {

		return new FlightReviewResponseDTO(flightReview.getFlightId(), flightReview.getNumberOfStars(),
				flightReview.getContent());
	}

	public FlightReviewResponseDTO getFlightReviewResponseDTO(FlightReview reviewFromDB) {
		// TODO Auto-generated method stub
		FlightReviewResponseDTO obj = new FlightReviewResponseDTO(reviewFromDB.getFlightId(),
				reviewFromDB.getNumberOfStars(), reviewFromDB.getContent());
		return obj;
	}

	

}// end of class
