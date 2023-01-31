package com.cg.flight.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Passenger;
import com.cg.flight.app.repository.IPassengerRepository;

@Service
public class PassengerServiceImpl implements IPassengerService{
	
	@Autowired
    IPassengerRepository passengerRepository;
	
    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
    
	@Override
	public void deletePassenger(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return passengerRepository.findAll();
	}
	
	@Override
	public Passenger getPassengerByPRN(int id) {
		// TODO Auto-generated method stub
		return (Passenger) passengerRepository.findAll();

	}

	@Override
	public Passenger getPassengerByName(String name) {
		// TODO Auto-generated method stub
		return (Passenger) passengerRepository.findAll();

	}

	@Override
	public Passenger getPassengerByCity(String city) {
		// TODO Auto-generated method stub
		return (Passenger) passengerRepository.findAll();

	}

	@Override
	public Passenger getPassengerName(String passengerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger getPassengerAge(int passengerAge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger getCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}


}
