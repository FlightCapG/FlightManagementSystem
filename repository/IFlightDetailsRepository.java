package com.cg.flight.app.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.flight.app.entity.Flight;

@Repository
public interface IFlightDetailsRepository extends JpaRepository<Flight, Long>{
	
	public Flight getFlightById(long flightId);
	public Flight getFlightByCarrierName(String carrierName);

	

	//public Flight getFlightById(long flightId);
	

//	public Flight addFlightDetails(Flight flight);
//	public Flight updatFlightDetails(Flight flight);
//	public Flight deleteFlightDetails(Flight flight);
//	
//	public List<Flight> getFlightByNumber(long flightNumber);
//	public List<Flight> viewAllFlights();
//	public List<Flight> getFlightByCarrierName(String carrierName);
	//public List<Flight> getFlightBySeatCapacity(int seatCapacity);

}
