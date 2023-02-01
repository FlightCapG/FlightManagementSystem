package com.cg.flight.app.service;
import com.cg.flight.app.entity.*;
import com.cg.flight.app.exception.ScheduledFlightNotFoundException;
import com.cg.flight.app.repository.ScheduleFlightRepository;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ScheduleFlightServicesImpl implements ScheduleFlightServices{
	
	@Autowired
	ScheduleFlightRepository scheduleFlightRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduledFlight) {
		if(scheduleFlightRepository.existsById(scheduledFlight.getScheduleFlightId())) {
			throw new ScheduledFlightNotFoundException("Scheduled Flight Already exists");
		}
		return 
				scheduleFlightRepository.save(scheduledFlight);
	}
	@Override
	public Flight viewScheduledFlight(Integer scheduledFlightId) {
	if(!scheduleFlightRepository.existsById(scheduledFlightId)) {
		throw new ScheduledFlightNotFoundException("Scheduled Flight not found");
	}
	return
			(Flight) scheduleFlightRepository.getReferenceById(Collections.singleton(scheduledFlightId));
	}	
	/*@Override
	public List<ScheduledFlight> viewScheduledFlight1(Integer fn) {
		Optional<Flight>op=ScheduleFlightRepository.referanceById(fn);
		Flight flight=op.get();
		return flight;	
	}*/
	@Override
	public List<ScheduledFlight>viewScheduledFlight() {
		return scheduleFlightRepository.findAll();
	}
	@Override
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight) {
		if(!scheduleFlightRepository.existsById(scheduledFlight.getScheduleFlightId())) {
			throw new ScheduledFlightNotFoundException("Scheduled Flight not for modifying");
		}
		Optional<ScheduledFlight> getReferancebyid=ScheduleFlightRepository.getReferanceByid(scheduledFlight.getScheduleFlightId());
		if (getReferancebyid.isPresent()) {
			scheduleFlightRepository.save(scheduledFlight);
		}
		return scheduledFlight;
	}
	@Override
	public void deleteScheduledFlight(Integer scheduledFlightId) {
		if(!scheduleFlightRepository.existsById(scheduledFlightId)) {
			throw new ScheduledFlightNotFoundException("Schdeuled Flight not found");
		}
		scheduleFlightRepository.deleteById(scheduledFlightId);
	}
}

