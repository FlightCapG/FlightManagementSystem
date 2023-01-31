package com.cg.flight.app.controller;

import java.time.LocalDateTime;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.dto.PassengerDTO;
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
		
		System.out.println("Passenger Controller Called");
	}
	
	@GetMapping("/welcome")
	public String sayHello()
	{
		LocalDateTime todayDate = LocalDateTime.now();
		return "Welcome "+todayDate;
	}
	
	@PostMapping("/register")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        return new ResponseEntity<Passenger>(passengerService.addPassenger(passenger), HttpStatus.OK);
    }
        
	@GetMapping("/All")
	public ResponseEntity<List<PassengerDTO>> getAllPassengerDTO(){
		
		List<Passenger> allPassengers=passengerService.getAllPassengers();
		List<PassengerDTO> allPassengerDTO = new ArrayList<>();
		for(Passenger passenger:allPassengers) {
			allPassengerDTO.add(passengerDTOConvertor.GetPassengerDTO(passenger));
		}
		return new ResponseEntity<List<PassengerDTO>>(allPassengerDTO,HttpStatus.OK);
		
	}
	    
    @GetMapping("/id")
	public ResponseEntity<PassengerDTO> getPassengerByPRN(@RequestParam int id){
		
        Passenger passengerFromDB = passengerService.getPassengerByPRN(id);
		
		PassengerDTO dto = passengerDTOConvertor.GetPassengerDTO(passengerFromDB);
		
		return new ResponseEntity<PassengerDTO>(dto,HttpStatus.OK);
	}
    
    @GetMapping("/name")
	public ResponseEntity<PassengerDTO> getPassengerByName(@RequestParam String name){
		
        Passenger passengerFromDB = passengerService.getPassengerByName(name);
		
		PassengerDTO dto = passengerDTOConvertor.GetPassengerDTO(passengerFromDB);
		
		return new ResponseEntity<PassengerDTO>(dto,HttpStatus.OK);
	}
    
    @GetMapping("/city/{city}")
	public ResponseEntity<PassengerDTO> getPassengerByCity(@RequestParam String city){
		
        Passenger passengerFromDB = passengerService.getPassengerByCity(city);
		
		PassengerDTO dto = passengerDTOConvertor.GetPassengerDTO(passengerFromDB);
		
		return new ResponseEntity<PassengerDTO>(dto,HttpStatus.OK);
	}
    
    @DeleteMapping("/deletePassenger/{id}")
    public ResponseEntity<Void> deletePassenger(@PathVariable long id){
    	passengerService.deletePassenger(id);
    	return ResponseEntity.noContent().build();
    }

    

    

}

