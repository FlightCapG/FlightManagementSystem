package com.cg.flight.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Passenger;
import com.cg.flight.app.exception.InvalidPassengerException;
import com.cg.flight.app.repository.IPassengerRepository;

@Service
public class PassengerServiceImpl implements IPassengerService{
              
              @Autowired
    IPassengerRepository passengerRepository;
              
    @Override
    public Passenger addPassenger(Passenger passenger) throws Exception{
              
              if(passenger.getPassengerName().equals("")) {
                             throw new InvalidPassengerException("Invalid Passenger Name");
              }
              if(passenger.getCity().equals("")) {
                             throw new InvalidPassengerException("Invalid Passenger City");
              }else
        return passengerRepository.save(passenger);
    }
    
              @Override
              public List<Passenger> getAllPassengers() {
                             // TODO Auto-generated method stub
                             return passengerRepository.findAll();
              }
              
              @Override
              public Passenger getPassengerByPRN(int prnNumber) {
                             // TODO Auto-generated method stub
                             return passengerRepository.getReferenceById(prnNumber);

              }

              @Override
              public List<Passenger> getPassengerByName(String passengerName) {
                             // TODO Auto-generated method stub
                             return passengerRepository.findAll();

              }

              @Override
              public List<Passenger> getPassengerByCity(String city) {
                             
                             return passengerRepository.findAll();

              }

              

              @Override
              public void deletePassenger(int prnNumber) {
                             // TODO Auto-generated method stub
                             passengerRepository.deleteById(prnNumber);

              }


}

