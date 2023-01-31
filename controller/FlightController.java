package com.cg.flight.app.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.dto.FlightDTO;
import com.cg.flight.app.dto.FlightResponseDTO;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.service.IFlightService;
import com.cg.flight.app.util.FlightDTOCovertor;

@RestController
@RequestMapping("/flight")
public class FlightController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IFlightService flightService;
	
	@Autowired
	private FlightDTOCovertor flightDTOCovertor;

	public FlightController() {
		logger.info("---Course Controller Called --");
		logger.warn("---Course Controller Called --");
		System.out.println("Welcome to Flight Management");
	
	}

	@PostMapping("/addFlight")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
		// Flight savedFlight = flightService.addFllight(flight);

		return new ResponseEntity<Flight>(flightService.addFllight(flight), HttpStatus.OK);
	}

	@GetMapping("/all/Flights")
	public ResponseEntity<List<FlightDTO>> getAllFlights() { 
		List<Flight> allFlights = flightService.getAllFlights();
		List<FlightDTO> allFlightDTO = new ArrayList<>();
		for(Flight flight : allFlights) {
			allFlightDTO.add(flightDTOCovertor.getFlightDTO(flight));
		}
	
		return new ResponseEntity<List<FlightDTO>>(allFlightDTO,HttpStatus.OK);

	}
	@GetMapping("/flightNumber/{flightNumber}")
	public ResponseEntity<FlightDTO> getFlightById(@RequestParam long flightId){
		
		Flight flightFromDB = flightService.getFlightById(flightId);
		FlightDTO dto = flightDTOCovertor.getFlightDTO(flightFromDB);
	
		return new ResponseEntity<FlightDTO>(dto,HttpStatus.OK);
		
	}
	@GetMapping("/FlightByCarrierName/{carrierName}")
	public ResponseEntity<FlightDTO> getFlightByCarrierName(@RequestParam String carrierName){
		
		Flight flightFromDB = flightService.getFlightByCarrierName(carrierName);
		FlightDTO dto = flightDTOCovertor.getFlightDTO(flightFromDB);
		
		return new ResponseEntity<FlightDTO>(dto,HttpStatus.OK);
		
	}
	
//	@GetMapping("/seats")
//	public ResponseEntity<FlightDTO> getFlightBySeatCapacity(@RequestParam int seatCapacity){
//		
//		Flight flightFromDB = flightService.getFlightBySeatCapacity(seatCapacity);
//		
//		FlightDTO dto = flightDTOCovertor.getFlightDTO(flightFromDB);
//		
//		return new ResponseEntity<FlightDTO>(dto,HttpStatus.OK);
//		
//	}
		
	
}

	
	

		
	
	


