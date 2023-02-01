package com.cg.flight.app.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Flight;

@Service
public interface IFlightService {

	public Flight addFlight(Flight flight);
	public Flight getFlightById(int flightId);
	public Flight getFlightByCarrierName(String flightName);
	public List<Flight> getAllFlights();
	public Flight updateFlightById(int flightId);
	public void deleteFlightById(int flightId);  
}
