package com.cg.flight.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flight.app.dto.ScheduleDTO;
import com.cg.flight.app.dto.ScheduleResponseDTO;
import com.cg.flight.app.entity.Schedule;
import com.cg.flight.app.service.ScheduleService;
import com.cg.flight.app.util.ScheduleDTOConvertor;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	 
	@PostMapping("/register")
	public ResponseEntity<Schedule> addFlight(@RequestBody Schedule s)
	{
		return new
				ResponseEntity<Schedule>(scheduleService.addSchedule(s),HttpStatus.CREATED); 
	}
		
	/*@GetMapping("/All")
	public ResponseEntity<List<ScheduleDTO>> getAllScheduleDTO(){
	List<Schedule> allSchedule=ScheduleService.getAllSchedule();
	List<ScheduleDTO> allScheduleDTO = new ArrayList<>();
	for(Schedule schedule:allSchedule)
		{
			allScheduleDTO.add(ScheduleController.getScheduleDTO(schedule));
		}
		return new ResponseEntity<List<ScheduleDTO>>(allScheduleDTO,HttpStatus.OK);
	}
	@GetMapping("/arrivalTime}")
	public ResponseEntity<ScheduleResponseDTO> getScheduleByArrivalTime(@PathVariable String arrivalTime)
	{
		Schedule allschdeule = scheduleService.getarrivalTime(arrivalTime);
		ScheduleResponseDTO dto = ScheduleDTOConvertor.convertTo(allschedule);
	return new ResponseEntity<ScheduleDTO>(dto,HttpStatus.OK);
	}*/


}
