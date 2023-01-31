package com.cg.flight.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.flight.app.repository.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleRepository scheduleRepository;
	@Override
	public Schedule addSchedule(Schedule s) {
		return scheduleRepository.save(s);
	}
}
