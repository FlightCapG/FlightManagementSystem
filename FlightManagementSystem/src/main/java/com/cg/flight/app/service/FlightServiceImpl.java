package com.cg.flight.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.exception.InvalidFlightException;
import com.cg.flight.app.repository.IFlightDetailsRepository;
@Service

public class FlightServiceImpl implements IFlightService {
@Autowired
IFlightDetailsRepository flightDetailsRepository;
@Override
public Flight addFlight(Flight flight) throws Exception {
if (flight.getCarrierName().equals("")) {
throw new InvalidFlightException("Carrier Name Not found");
}
if (flight.getSourceAirport().equals("")) {
throw new InvalidFlightException("Source Airport Not Found");
}
if (flight.getDestinationAirport().equals("")) {
throw new InvalidFlightException("Destination Airport Not Found");
} else
return flightDetailsRepository.save(flight);
}
@Override
public List<Flight> getAllFlights() {
return flightDetailsRepository.findAll();
}
@Override
public Flight getFlightById(int flightId) {
return flightDetailsRepository.getReferenceById(flightId);
}
@Override
public List<Flight> getFlightByCarrierName(String carrierName) {
return flightDetailsRepository.findAll();
}
@Override
public List<Flight> getFlightBySourceAirport(String sourceAirport) {
return flightDetailsRepository.findAll();
}
@Override
public List<Flight> getFlightByDestinationAirport(String destinationAirport) {
return flightDetailsRepository.findAll();
}
@Override
public Flight updateFlightById(int flightId) {
return flightDetailsRepository.getReferenceById(flightId);
}
@Override
public void deleteFlightById(int flightId) {
flightDetailsRepository.deleteById(flightId);
}
}
