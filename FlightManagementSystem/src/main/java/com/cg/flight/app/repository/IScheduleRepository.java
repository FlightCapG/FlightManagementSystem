package com.cg.flight.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.flight.app.entity.Schedule;

@Repository
public interface IScheduleRepository extends JpaRepository<Schedule, Integer> {

              // public List<Schedule> getScheduleByAvailableSeat(int availableseat);
}

