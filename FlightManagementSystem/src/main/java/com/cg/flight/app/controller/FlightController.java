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
logger.info("---Flight Controller Called --");
logger.warn("---Flight Controller Called --");
System.err.println("Welcome to Flight Management");
}
@PostMapping("/register")
public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) throws Exception {
return new ResponseEntity<Flight>(flightService.addFlight(flight), HttpStatus.OK);
}// localhost:8088/flight/register
@GetMapping("/list")
public ResponseEntity<List<FlightDTO>> getAllFlights() {
List<Flight> allFlights = flightService.getAllFlights();
List<FlightDTO> allFlightDTO = new ArrayList<>();
for (Flight flight : allFlights) {
allFlightDTO.add(flightDTOConvertor.getFlightDTO(flight));
}
return new ResponseEntity<List<FlightDTO>>(allFlightDTO, HttpStatus.OK);
}// localhost:8088/flight/list
@GetMapping("/id/{flightId}")
public ResponseEntity<FlightResponseDTO> getFlightById(@PathVariable int flightId) {
Flight savedFlight = flightService.getFlightById(flightId);
FlightResponseDTO dto = flightDTOConvertor.getFlightResponseDTO(savedFlight);
return new ResponseEntity<FlightResponseDTO>(dto, HttpStatus.OK);
}// localhost:8088/flight/id
@GetMapping("/cn/{carrierName}")
public ResponseEntity<List<FlightDTO>> getFlightByCarrierName(@PathVariable String carrierName) throws Exception {
List<Flight> allFlights = flightService.getFlightByCarrierName(carrierName);
List<FlightDTO> allFlightDTOs = new ArrayList<>();
for (Flight flight : allFlights) {
if (flight.getCarrierName().equals(carrierName)) {
allFlightDTOs.add(flightDTOConvertor.getFlightDTO(flight));
return new ResponseEntity<List<FlightDTO>>(allFlightDTOs, HttpStatus.OK);
}
}
return null;
}// localhost:8088/flight/cn
@GetMapping("/sa/{sourceAirport}")
public ResponseEntity<List<FlightDTO>> getFlightBySourceAirport(@PathVariable String sourceAirport)
throws Exception {
List<Flight> allFlights = flightService.getFlightBySourceAirport(sourceAirport);
List<FlightDTO> allFlightDTOs = new ArrayList<>();
for (Flight flight : allFlights) {
if (flight.getSourceAirport().equals(sourceAirport)) {
allFlightDTOs.add(flightDTOConvertor.getFlightDTO(flight));
return new ResponseEntity<List<FlightDTO>>(allFlightDTOs, HttpStatus.OK);
}
}
return null;
}// localhost:8088/flight/sa
@GetMapping("/da/{destinationAirport}")
public ResponseEntity<List<FlightDTO>> getFlightByDestinationAirport(@PathVariable String destinationAirport)
throws Exception {
List<Flight> allFlights = flightService.getFlightByDestinationAirport(destinationAirport);
List<FlightDTO> allFlightDTOs = new ArrayList<>();
for (Flight flight : allFlights) {
if (flight.getDestinationAirport().equals(destinationAirport)) {
allFlightDTOs.add(flightDTOConvertor.getFlightDTO(flight));
return new ResponseEntity<List<FlightDTO>>(allFlightDTOs, HttpStatus.OK);
}
}
return null;
}// localhost:8088/flight/da
@PutMapping("/updateFlight/{flightId}")
public String updateFlight(@PathVariable int flightId) {
Flight updateFlight = flightService.getFlightById(flightId);
return updateFlight.toString();
}// localhost:8088/flight/updateFlight
@DeleteMapping("/deleteFlight/{flightId}")
public ResponseEntity<Void> deleteFlightById(@PathVariable int flightId) {
flightService.deleteFlightById(flightId);
return new ResponseEntity<Void>(HttpStatus.OK);
}// localhost:8088/flight/deleteFlight
}

