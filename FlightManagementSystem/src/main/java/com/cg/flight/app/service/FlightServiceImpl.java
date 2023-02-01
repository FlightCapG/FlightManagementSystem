package com.cg.flight.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.exception.FlightIdNotFoundException;
import com.cg.flight.app.repository.IFlightDetailsRepository;

@Service
public class FlightServiceImpl implements IFlightService {

	@Autowired
	IFlightDetailsRepository flightDetailsRepository;

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return flightDetailsRepository.findAll();
	}

	@Override
	public Flight getFlightById(int flightId) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.getReferenceById(flightId);
	}

	@Override
	public Flight getFlightByCarrierName(String flightName) {
		// TODO Auto-generated method stub
		return (Flight) flightDetailsRepository.findAll();
	}

	@Override
	public Flight updateFlightById(int flightId) {
		// TODO Auto-generated method stub
		return flightDetailsRepository.getReferenceById(flightId);
	}

	@Override
	public void deleteFlightById(int flightId) {
		// TODO Auto-generated method stub
		flightDetailsRepository.deleteById(flightId);
	}

	
//	@Override
//	public Flight updateFlight(Flight mod) {
//		// TODO Auto-generated method stub.
//		return flightDetailsRepository.save(mod);
//	}
//
//	@Override
//	public void deleteFlight(int flightId)  {
//		// TODO Auto-generated method stub

	}