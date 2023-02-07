package com.cg.flight.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.FlightReview;

@Service
public interface FlightReviewService {

	public FlightReview addReview(FlightReview flightReview)throws Exception;

	public List<FlightReview> getAllReviews();

	// specific methods
	public List<FlightReview> getReviewByFlightId(int flightId);

	public List<FlightReview> getRatingsByFlightId(int flightId, int numberOfStars, String action);

}// end of interface
