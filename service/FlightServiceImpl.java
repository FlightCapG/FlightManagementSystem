package com.cg.flight.app.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.repository.IFlightDetailsRepository;

@Service
public class FlightServiceImpl implements IFlightService {
	
	@Autowired
	IFlightDetailsRepository flightDetailsRepository;
	
	@Autowired
	IFlightService flightService;

	@Override
	public Flight addFllight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.save(flight);
	}

	@Override
	public Flight getFlightById (long flightId) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.getFlightById(flightId);
	}

	@Override
	public Flight getFlightByCarrierName(String carrierName) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.getFlightByCarrierName(carrierName);
	}

	@Override
	public Flight getFlightBySeatCapacity(int seatCapacity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlightBySourceAirport(String sourceAirport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlightByDestinationAirport(String destinationAirport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight getFlightByDuration(String duration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}
}

	


/*@Override
public Course getCourseById(int id) {
	Optional<Course> optional = courseRepository.findById(id);
	if(!optional.isPresent())
	{
		System.out.println("course not found");
	}
	Course course = optional.get();
	Course c = courseRepository.getReferenceById(id);
	
	return null;
*/