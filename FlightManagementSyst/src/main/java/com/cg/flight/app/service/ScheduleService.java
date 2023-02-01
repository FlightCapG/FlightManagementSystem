package com.cg.flight.app.service;
import org.springframework.stereotype.Service;

import com.cg.flight.app.entity.Schedule;


@Service
public interface ScheduleService {
public Schedule addSchedule(Schedule s);
public Schedule getavaialbleSeat(int avaibleSeat);
public Schedule getarrivalTime(String arrivalTime);
public Schedule getdepartureTime(String departureTime);



}
