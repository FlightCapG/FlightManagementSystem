package com.cg.flight.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Flight;
@Service


	public interface IFlightService {
		public Flight addFlight(Flight flight) throws Exception;
		public Flight getFlightById(int flightId);
		public List<Flight> getFlightByCarrierName(String carrierName);
		public List<Flight> getFlightBySourceAirport(String sourceAirport);
		public List<Flight> getFlightByDestinationAirport(String destinationAirport);
		public List<Flight> getAllFlights();
		public Flight updateFlightById(int flightId);
		public void deleteFlightById(int flightId);


}
