package com.cg.flight.app.entity;
import javax.persistence.*;

@Entity
public class ScheduledFlight {
	
		@Id
		@Column(name="scheduledFlightId")
		private int scheduleFlightId;
		@OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
		private Flight flight ;
		private int avaliableSeats;
		
		private Schedule schedule;
		public int getScheduleFlightId() {
			return scheduleFlightId;
		}
		public void setScheduleFlightId(int scheduleFlightId) {
			this.scheduleFlightId = scheduleFlightId;
		}
		public Flight getFlight() {
			return flight;
		}
		public void setFlight(Flight flight) {
			this.flight = flight;
		}
		public int getAvaliableSeats() {
			return avaliableSeats;
		}
		public void setAvaliableSeats(int avaliableSeats) {
			this.avaliableSeats = avaliableSeats;
		}
		public Schedule getSchedule() {
			return schedule;
		}
		public void setSchedule(Schedule schedule) {
			this.schedule = schedule;
		}
		

}
