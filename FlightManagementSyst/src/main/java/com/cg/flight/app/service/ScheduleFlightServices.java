package com.cg.flight.app.service;
import com.cg.flight.app.entity.Flight;
import com.cg.flight.app.entity.Schedule.*;
import com.cg.flight.app.entity.ScheduledFlight;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public interface ScheduleFlightServices {
	
	ScheduledFlight scheduleFlight(ScheduledFlight sf);
	List<ScheduledFlight>viewScheduledFlight1(Integer scheduledFlightId);
	Flight viewScheduledFlight(Integer fn);
	
	List<ScheduledFlight>viewScheduledFlight();
	ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);
		void deleteScheduledFlight(Integer scheduledFlightId);
		List<ScheduledFlight> viewScheduledFlight(BigInteger scheduledFlightId);
}
	
	
	
	
	
	
	
	
	


