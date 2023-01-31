package com.cg.flight.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.flight.app.entity.Schedule;


@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer>
{

}
