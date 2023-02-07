package com.cg.flight.app.util;

import org.springframework.stereotype.Component;

import com.cg.flight.app.dto.PassengerDTO;
import com.cg.flight.app.dto.PassengerResponseDTO;
import com.cg.flight.app.entity.Passenger;

@Component
public class PassengerDTOConverter {
              
              public PassengerResponseDTO convertTo(Passenger passenger)
              {
                             PassengerResponseDTO dto = new PassengerResponseDTO();
                             dto.setPrnNumber(passenger.getPrnNumber());
                             dto.setPassengerName(passenger.getPassengerName());
                             dto.setPassengerAge(passenger.getPassengerAge());
                             dto.setCity(passenger.getCity());

                             dto.setMsg("Passenger Saved");
                             return dto;
              }

              
              public PassengerDTO getPassengerDTO(Passenger passenger)
              {
                             return new PassengerDTO(passenger.getPrnNumber(), passenger.getPassengerName(), passenger.getPassengerAge(), passenger.getCity());
              }


}

