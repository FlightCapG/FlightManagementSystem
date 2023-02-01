package com.cg.flight.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.entity.Schedule;
import com.cg.flight.app.service.ScheduleService;

@RestController
@RequestMapping(value="/schedule")
public class ScheduledController {
	
	@Autowired
	private ScheduleService scheduleService;
	 
	@PostMapping(value="/addSchedule")
	public ResponseEntity<Schedule> addFlight(@RequestBody Schedule s){
		return new
				ResponseEntity<Schedule>(scheduleService.addSchedule(s),HttpStatus.CREATED);
	}
}
