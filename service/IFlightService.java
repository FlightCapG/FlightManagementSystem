package com.cg.flight.app.service;
import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Flight;

@Service
public interface IFlightService {
	
	public Flight addFllight(Flight flight);
	public Flight getFlightById(long flightId);
	public Flight getFlightByCarrierName(String carrierName);
	public Flight getFlightBySeatCapacity(int seatCapacity);
	public Flight getFlightBySourceAirport(String sourceAirport);
	public Flight getFlightByDestinationAirport(String destinationAirport);
	public Flight getFlightByDuration(String duration);
	public List<Flight> getAllFlights();
	
	
	
	//public List<Flight> getFlightByCarrierName(String carrierName);
	//public List<Flight> getFlightBySeatCapacity(int seatCapacity);
	

}
