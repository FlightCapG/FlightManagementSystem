package com.cg.flight.app.exception;

public class ScheduledFlightNotFoundException extends RuntimeException{
	public ScheduledFlightNotFoundException(String message) {
		super(message);
	}

}
