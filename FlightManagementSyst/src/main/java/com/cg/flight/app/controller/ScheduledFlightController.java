package com.cg.flight.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.entity.Schedule;
import com.cg.flight.app.entity.ScheduledFlight;
import com.cg.flight.app.service.ScheduleFlightServices;

@RestController
@RequestMapping(value ="/Scheduleflight")
public class ScheduledFlightController {

	@Autowired 
	private ScheduleFlightServices scheduleFlightServices;
	@Autowired
	private FlightService flightService;
	
	List<ScheduleFlightServices> scheduleFlightServicesList;
	
	@PostMapping(value = "/sF")
		public ResponseEntity<ScheduledFlight>scheduledFlight(@RequestBody ScheduledFlight sf){
			return new
				ResponseEntity<ScheduledFlight>(scheduleFlightServices.scheduleFlight(sf), HttpStatus .CREATED);
	}
	@GetMapping(value = " /vSF/{scheduledFlightId}")
		public ResponseEntity<Flight> viewScheduledFlights(@PathVariable int scheduledFlightId) {
			return ResponseEntity.ok(scheduleFlightServices.viewScheduledFlight(scheduledFlightId));
	}
	@GetMapping (value = "/vSFF/{fn}")
		public ResponseEntity<Flight>viewScheduledFlights (@PathVariable Integer fn){
			return ResponseEntity.ok(scheduleFlightServices.viewScheduledFlight (fn));
	}
	@GetMapping (value = " /viewScheduledFlight")
		public ResponseEntity<List<ScheduledFlight>>viewScheduledFlight() {
		return new
				ResponseEntity<List<ScheduledFlight>>(scheduleFlightServices.viewScheduledFlight(),HttpStatus.OK);
	}
	@PostMapping (value = "/mSF")
	public ResponseEntity<ScheduledFlight> modifyScheduledFlight (@RequestBody ScheduledFlight scheduledFlight) {
		ScheduledFlight scheduledFlight1=scheduleFlightServices.modifyScheduledFlight (scheduledFlight);
		return new ResponseEntity<ScheduledFlight>(scheduledFlight, HttpStatus.OK);
	}
	@DeleteMapping (value = "dSF/{scheduledFlightId}")
	public ResponseEntity<String> deleteScheduledFlight(@PathVariable Integer scheduledFlightId) {
		scheduleFlightServices.deleteScheduledFlight(scheduledFlightId);
			return new ResponseEntity<String>("Schedule with flightID "+scheduledFlightId+" deleted successfully", HttpStatus.OK);
	}
}

