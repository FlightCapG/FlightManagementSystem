package com.cg.flight.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Passenger;

@Service
public interface IPassengerService {
	
	public Passenger addPassenger(Passenger passenger);
	public Passenger getPassengerByPRN(int id);
	public Passenger getPassengerByName(String name);
	public Passenger getPassengerByCity(String city);
	public List<Passenger> getAllPassengers();
	public Passenger getPassengerName(String passengerName);
	public Passenger getPassengerAge(int passengerAge);
	public Passenger getCity(String city);
	public void deletePassenger(long id);



}
