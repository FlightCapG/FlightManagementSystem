package com.cg.flight.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Passenger;

@Service
public interface IPassengerService {
              
              public Passenger addPassenger(Passenger passenger)throws Exception;
              public Passenger getPassengerByPRN(int prnNumber);
              public List<Passenger> getPassengerByName(String passengerName);
              public List<Passenger> getPassengerByCity(String city);
              public List<Passenger> getAllPassengers();
              public void deletePassenger(int prnNumber);



}
