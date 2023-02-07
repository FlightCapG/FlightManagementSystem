package com.cg.flight.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.FlightReview;
import com.cg.flight.app.exception.ContentNotFoundException;
import com.cg.flight.app.repository.IFlightReviewRepository;

@Service
public class FlightReviewServiceImpl implements FlightReviewService {

	@Autowired
	IFlightReviewRepository flightReviewRepository;

	@Override
	public FlightReview addReview(FlightReview flightReview) throws Exception {
		// TODO Auto-generated method stub
		if (flightReview.getContent().equals("")) {
			throw new ContentNotFoundException("Review not found");
		} else

			return flightReviewRepository.save(flightReview);
	}

	@Override
	public List<FlightReview> getAllReviews() {
		// TODO Auto-generated method stub
		return flightReviewRepository.findAll();
	}

	@Override
	public List<FlightReview> getReviewByFlightId(int flightId) {
		// TODO Auto-generated method stub
		return (List<FlightReview>) flightReviewRepository.getReviewByFlightId(flightId);
	}

	@Override
	public List<FlightReview> getRatingsByFlightId(int searchflightId, int numberOfStars, String action) {
		// TODO Auto-generated method stub

		List<FlightReview> allreviews = getReviewByFlightId(searchflightId);
		List<FlightReview> filteredReview = new ArrayList<>();

		for (FlightReview flightReview : allreviews) {

			int star = flightReview.getNumberOfStars();

			if (action.equalsIgnoreCase("below") && star <= numberOfStars) {
				filteredReview.add(flightReview);

			} else if (action.equalsIgnoreCase("above") && star >= numberOfStars) {
				filteredReview.add(flightReview);

			}

		}
		return filteredReview;
	}

}// end of class
