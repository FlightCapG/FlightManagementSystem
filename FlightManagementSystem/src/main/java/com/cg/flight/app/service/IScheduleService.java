package com.cg.flight.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Schedule;

@Service
public interface IScheduleService {
              public Schedule addSchedule(Schedule schedule) throws Exception;

              public List<Schedule> getAllSchedule();

              public Schedule getAvaialbleseat(int availableseat);

              public Schedule getArrivaltime(String arrivalTime);

              public Schedule getDeparturetime(String departureTime);

              public List<Schedule> getScheduleByArrivalTime(String arrivalTime);

              public List<Schedule> getScheduleByDepartureTime(String departureTime);

              public Schedule getScheduleByAvailableSeat(int availableseat);

              public Schedule getScheduleByScheduleId(int scheduleId);

              public Schedule updateAvailableSeat(int availableseat);

              public void deleteAvailableSeat(int availableseat);

}

