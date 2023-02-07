package com.cg.flight.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.flight.app.entity.Schedule;
import com.cg.flight.app.exception.InvalidScheduleException;
import com.cg.flight.app.repository.IScheduleRepository;

@Service
public class ScheduleServiceImpl implements IScheduleService {

              @Autowired
              IScheduleRepository scheduleRepository;

              @Override
              public Schedule addSchedule(Schedule schedule) throws Exception {
                             if (schedule.getArrivalTime() == ("")) {
                                           throw new InvalidScheduleException("Invalid Arrival Time");

                             }

                             if (schedule.getDepartureTime() == ("")) {
                                           throw new InvalidScheduleException("Invalid Departure Time");

                             } else

                                           return scheduleRepository.save(schedule);
              }

              @Override
              public List<Schedule> getAllSchedule() {
                             // TODO Auto-generated method stub
                             return scheduleRepository.findAll();
              }

              @Override
              public Schedule getAvaialbleseat(int availableseat) {
                             // TODO Auto-generated method stub
                             return null;
              }

              @Override
              public Schedule getArrivaltime(String arrivalTime) {
                             // TODO Auto-generated method stub
                             return null;
              }

              @Override
              public Schedule getDeparturetime(String departureTime) {
                             // TODO Auto-generated method stub
                             return null;
              }

              @Override
              public List<Schedule> getScheduleByArrivalTime(String arrivalTime) {
                             // TODO Auto-generated method stub
                             return scheduleRepository.findAll();
              }

              @Override
              public List<Schedule> getScheduleByDepartureTime(String departureTime) {
                             // TODO Auto-generated method stub
                             return scheduleRepository.findAll();
              }

              @Override
              public Schedule getScheduleByAvailableSeat(int availableseat) {
                             // TODO Auto-generated method stub
                             return scheduleRepository.getReferenceById(availableseat);
              }

              @Override
              public Schedule getScheduleByScheduleId(int scheduleId) {
                             // TODO Auto-generated method stub
                             return scheduleRepository.getReferenceById(scheduleId);
              }

              @Override
              public Schedule updateAvailableSeat(int availableseat) {
                             // TODO Auto-generated method stub
                             return scheduleRepository.getReferenceById(availableseat);
              }

              @Override
              public void deleteAvailableSeat(int availableseat) {
                             // TODO Auto-generated method stub
                             scheduleRepository.deleteById(availableseat);
              }

}

