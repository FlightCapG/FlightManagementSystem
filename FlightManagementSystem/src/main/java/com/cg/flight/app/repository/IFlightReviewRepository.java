package com.cg.flight.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flight.app.entity.FlightReview;

@Repository
public interface IFlightReviewRepository extends JpaRepository<FlightReview, Integer> {

	public List<FlightReview> getReviewByFlightId(int flightId);

}// end of interface

