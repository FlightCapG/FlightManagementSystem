package com.cg.flight.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.dto.FlightReviewResponseDTO;
import com.cg.flight.app.entity.FlightReview;
import com.cg.flight.app.service.FlightReviewService;
import com.cg.flight.app.util.FlightReviewDTOConvertor;

@RestController
@RequestMapping("/app")
public class FlightReviewController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FlightReviewService flightReviewService;

	@Autowired
	FlightReviewDTOConvertor flightReviewDTOConvertor;

	public FlightReviewController() {
		logger.info("---Review Controller Called --");
		logger.warn("---Review Controller Called --");

		System.out.println("Review Controller Called");
	}

	@PostMapping("/review")
	public ResponseEntity<FlightReviewResponseDTO> addReview(@RequestBody FlightReview flightReview)throws Exception {
		FlightReview savedReview = flightReviewService.addReview(flightReview);

		FlightReviewResponseDTO responseDtO = flightReviewDTOConvertor.getFlightReviewResponseDTO(savedReview);
		return new ResponseEntity<FlightReviewResponseDTO>(responseDtO, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<FlightReviewResponseDTO>> getAllReviews() {

		List<FlightReview> allReviews = flightReviewService.getAllReviews(); // give us raw data (complete information , which
																		// we cannot share with users directly)
		// Converting into DTO form , which we can share with user
		List<FlightReviewResponseDTO> allReviewDTO = new ArrayList<>();

		for (FlightReview flightReview : allReviews) {

			FlightReviewResponseDTO flightReviewResponseDTO = flightReviewDTOConvertor
					.getFlightReviewResponseDTO(flightReview);
			allReviewDTO.add(flightReviewResponseDTO);
			// flightReviewDTOConvertor.add(flightReviewDTOConvertor.getFlightReviewResponseDTO(flightReview));

		}

		return new ResponseEntity<List<FlightReviewResponseDTO>>(allReviewDTO, HttpStatus.OK);
	}

	
	@GetMapping("/by/{flightId}")
	public ResponseEntity<List<FlightReviewResponseDTO>> getReviewByFlightId(@PathVariable int flightId)
			throws Exception {

	

		List<FlightReview> reviewFromDB = flightReviewService.getReviewByFlightId(flightId);

		List<FlightReviewResponseDTO> dto = new ArrayList<>();

		for (FlightReview flightReview : reviewFromDB) {

			FlightReviewResponseDTO dtoObj = flightReviewDTOConvertor.getFlightReviewResponseDTO(flightReview);
			dto.add(dtoObj);
		}
		return new ResponseEntity<List<FlightReviewResponseDTO>>(dto, HttpStatus.OK);

	}

	@GetMapping("/filter/{flightId}")
	public ResponseEntity<List<FlightReviewResponseDTO>> getRatingsByFlightId(@PathVariable int flightId,
			@RequestParam String action, @RequestParam int numberOfStars) {

		List<FlightReview> allFlights = flightReviewService.getRatingsByFlightId(flightId, numberOfStars, action);
		List<FlightReviewResponseDTO> dto = new ArrayList<>();
		for (FlightReview flightReview : allFlights) {
			FlightReviewResponseDTO flightDTO = flightReviewDTOConvertor.convertTo(flightReview);
			dto.add(flightDTO);
		}

		return new ResponseEntity<List<FlightReviewResponseDTO>>(dto, HttpStatus.OK);

		

	}
	// localhost:2001/app/filter/999?action=below&numberOfStars=5
	
	

}// end of class
