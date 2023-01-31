package com.cg.flight.app.util;

import org.springframework.stereotype.Component;

import com.cg.flight.app.dto.FlightDTO;
import com.cg.flight.app.dto.FlightResponseDTO;
import com.cg.flight.app.entity.Flight;

@Component
public class FlightDTOCovertor {
	public  FlightResponseDTO getFlightResponseDTO(Flight flight) {
		
		
		FlightResponseDTO dto = new FlightResponseDTO();
		
		dto.setFlightId(flight.getFlightId());
		dto.setCarrierName(flight.getCarrierName());
		dto.setSeatCapacity(flight.getSeatCapacity());
		dto.setSourceAirport(flight.getSourceAirport());;
		dto.setDestinationAirport(flight.getDestinationAirport());
		dto.setDuration(flight.getDuration());
		
		dto.setMsg("Flight Saved");
		return dto;
		
	} 
	public FlightDTO getFlightDTO(Flight flight) {
		return new FlightDTO(flight.getFlightId(),flight.getCarrierName(),flight.getSeatCapacity(),flight.getSourceAirport(),flight.getDestinationAirport(),flight.getDuration());
		
	}
	

}
