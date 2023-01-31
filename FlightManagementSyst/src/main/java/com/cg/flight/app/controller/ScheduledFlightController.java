package com.cg.flight.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Scheduledflight")
public class ScheduledFlightController {

		@Autowired 
		private ScheduleFlightServices scheduledFlightServices;
		@Autowired 
		private FlightService flightService;
		
		List<ScheduleFlightServices> scheduleFlightServicesList;
		
		@PostMapping (value = "/ sF")
		public ResponseEntity<ScheduledFlight> scheduledFlight (@RequestBody ScheduledFlight sf) {
		return new
		ResponseEntity<ScheduledFlight>(scheduleFlightServices.scheduleFlight(sf), HttpStatus .CREATED);
		}
		@GetMapping (value = " /VSF/{scheduledFlightId}")
		public ResponseEntity<List<ScheduledFlight>> viewScheduledFlights(@PathVariable int scheduledFlightId) {
		return
		ResponseEntity.ok(scheduleFlightServices.views scheduledFlight (scheduledFlightId));
		}
		@GetMapping (value = "/VSFF/{fn}")
		public ResponseEntity<Flight>
		viewScheduledFlights(@PathVariable Integer fn)
		{
		return
		ResponseEntity.ok(scheduleFlightServices.views cheduledFlights (fn));
		}
		@GetMapping (value = " / viewScheduledFlight")
		public
		ResponseEntity<List<ScheduledFlight>>viewScheduledFlight() {
		return new
		ResponseEntity<List<ScheduledFlight>>(schedule FlightServices.viewScheduledFight(),HttpStatu s.OK);
		}
		@PostMapping (value = "/mSF")
		public ResponseEntity<ScheduledFlight> modifyScheduledFlight(@RequestBody ScheduledFlight scheduledFlight) {
		ScheduledFlight scheduledFlight1=scheduleFlightServices.modify ScheduledFlight (scheduledFlight);
		return new
		ResponseEntity<ScheduledFlight>(scheduledFligh t, HttpStatus.OK);
		}
		@DeleteMapping (value = "dSF/ {scheduledFlightId}")
		public ResponseEntity<String> deleteScheduledFlight(@PathVariable Integer scheduledFlightId) {
		scheduleFlightServices.deleteScheduledFlight(s cheduledFlightId);
		return new
		ResponseEntity<String> ("Schedule with flight ID "+scheduledFlightId+" deleted successfully" , HttpStatus.OK);
		}


	}

}
