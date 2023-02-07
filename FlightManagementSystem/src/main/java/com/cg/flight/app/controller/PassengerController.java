package com.cg.flight.app.controller;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.dto.PassengerDTO;
import com.cg.flight.app.dto.PassengerResponseDTO;
import com.cg.flight.app.entity.Passenger;
import com.cg.flight.app.service.IPassengerService;
import com.cg.flight.app.util.PassengerDTOConverter;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

              private final Logger logger = LoggerFactory.getLogger(this.getClass());

              @Autowired
              private IPassengerService passengerService;

              @Autowired
              private PassengerDTOConverter passengerDTOConvertor;

              public PassengerController() {
                             logger.info("---Passenger Controller Called --");
                             logger.warn("---Passenger Controller Called --");

                             System.err.println("Passenger Controller Called");
              }

              @PostMapping("/register")
              public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) throws Exception {
                             return new ResponseEntity<Passenger>(passengerService.addPassenger(passenger), HttpStatus.OK);
              }

              @GetMapping("/All")
              public ResponseEntity<List<PassengerDTO>> getAllPassengerDTO() {
                             List<Passenger> allPassengers = passengerService.getAllPassengers();
                             List<PassengerDTO> allPassengerDTO = new ArrayList<>();
                             for (Passenger passenger : allPassengers) {
                             allPassengerDTO.add(passengerDTOConvertor.getPassengerDTO(passenger));
                             }
                             return new ResponseEntity<List<PassengerDTO>>(allPassengerDTO, HttpStatus.OK);

              }

              @GetMapping("/id/{prnNumber}")
              public ResponseEntity<PassengerResponseDTO> getPassengerByPRN(@PathVariable int prnNumber) {
                             Passenger allpassengers = passengerService.getPassengerByPRN(prnNumber);
                             PassengerResponseDTO dto = passengerDTOConvertor.convertTo(allpassengers);

                             return new ResponseEntity<PassengerResponseDTO>(dto, HttpStatus.OK);

              }

              @GetMapping("/name/{passengerName}")
              public ResponseEntity<List<PassengerDTO>> getPassengerByName(@PathVariable String passengerName) {
                             List<Passenger> allPassengers = passengerService.getPassengerByName(passengerName);
                             List<PassengerDTO> allPassengerDTO = new ArrayList<>();

                             for (Passenger passenger : allPassengers) {
                                           if (passenger.getPassengerName().equals(passengerName)) {
                                           allPassengerDTO.add(passengerDTOConvertor.getPassengerDTO(passenger));
                                                          return new ResponseEntity<List<PassengerDTO>>(allPassengerDTO, HttpStatus.OK);
                                           }

                             }

                             return null;

              }

              @GetMapping("/city/{city}")
              public ResponseEntity<List<PassengerDTO>> getPassengerByCity(@PathVariable String city) {
                             List<Passenger> allPassengers = passengerService.getPassengerByName(city);
                             List<PassengerDTO> allPassengersDTO = new ArrayList<>();

                             for (Passenger passenger : allPassengers) {
                                           if (passenger.getCity().equals(city)) {
                                           allPassengersDTO.add(passengerDTOConvertor.getPassengerDTO(passenger));
                                                          return new ResponseEntity<List<PassengerDTO>>(allPassengersDTO, HttpStatus.OK);
                                           }
                             }

                             return null;

              }


              @DeleteMapping("/{prnNumber}")
              public void deletePassenger(@PathVariable int prnNumber) {
                             passengerService.deletePassenger(prnNumber);
              }

}

