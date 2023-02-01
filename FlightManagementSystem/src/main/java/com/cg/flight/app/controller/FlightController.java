package com.cg.flight.app.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.flight.app.dto.FlightDTO;
import com.cg.flight.app.dto.FlightResponseDTO;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.service.IFlightService;
import com.cg.flight.app.util.FlightDTOConvertor;

@RestController
@RequestMapping("/flight")
public class FlightController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IFlightService flightService;

	@Autowired
	private FlightDTOConvertor flightDTOConvertor;

	public FlightController() {
		logger.info("---Course Controller Called --");
		logger.warn("---Course Controller Called --");
		System.err.println("Welcome to Flight Management");
	}

	@PostMapping("/registerFlight")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
		Flight savedFlight = flightService.addFlight(flight);
		System.out.println("In Add Flight");
		return new ResponseEntity<Flight>(flightService.addFlight(flight), HttpStatus.OK);
	}

	@GetMapping("/all/Flights")
	public ResponseEntity<List<FlightDTO>> getAllFlights() {
		List<Flight> allFlights = flightService.getAllFlights();
		List<FlightDTO> allFlightDTO = new ArrayList<>();
		for (Flight flight : allFlights) {
			allFlightDTO.add(flightDTOConvertor.getFlightDTO(flight));
		}

		return new ResponseEntity<List<FlightDTO>>(allFlightDTO, HttpStatus.OK);
	}

	@GetMapping("/id/{flightId}")
	public ResponseEntity<FlightResponseDTO> getFlightById(@PathVariable int flightId) {

		Flight savedFlight = flightService.getFlightById(flightId);
		FlightResponseDTO dto = flightDTOConvertor.getFlightResponseDTO(savedFlight);

		return new ResponseEntity<FlightResponseDTO>(dto,HttpStatus.OK);
	}

	@PutMapping("/updateFlight/{mod}")
	public Integer updateFlight(@PathVariable int mod) {
		Flight updateFlight = flightService.getFlightById(mod);
		return updateFlight.getFlightId();
	}

	@GetMapping("/name/{carrierName}")
	public ResponseEntity<FlightResponseDTO> getFlightByCarrierName(@PathVariable String carrierName) {
		Flight flightFromDB = flightService.getFlightByCarrierName(carrierName);
		FlightResponseDTO dto = flightDTOConvertor.getFlightResponseDTO(flightFromDB);

		return new ResponseEntity<FlightResponseDTO>(dto, HttpStatus.OK);
	}

	@DeleteMapping("/deleteflight/{flightId}")
	public ResponseEntity<Void> deleteFlightById(@PathVariable int flightId){
		flightService.deleteFlightById(flightId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	// localhost:8088/flight/registerFlight
	// localhost:8088/flight/all/Flights
	// localhost:8088/flight/id/
	// localhost:8080/flight/updateFlight
	//localhost:8080/flight/name
}
