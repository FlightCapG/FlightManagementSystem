package com.cg.flight.app.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.flight.app.entity.Schedule;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer>
{
	@Query(value = "select b.* from Schedule u inner join Schedule b on b.Flight_id = u.Flight_id where u.Flight_id = ?1", nativeQuery = true)
    Optional<Schedule> findscheduleByFlightId(Integer FlightId);
	
	 @Query("Select b from Schedule b where b.FlightId = ?1")
	    List<Schedule> ScheduleListByFlightId(Integer FlightId);
	 
	 @Query("Select b from Schedule b where b.scheduledflightId = ?1")
	    List<Schedule> schdeduleListByFlightId(Integer flightId);
	    @Query("Select b.scheduledflightId from  b where b.flightId = ?1")
	    List<Long> flightIdsByFlightId(Integer FlightId);

	    @Query("Select b.userId from Schdeule b where b.FlightId = ?1")
	    Long findFlightIdBySchedule(Integer FlightId);

}
