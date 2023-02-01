package com.cg.flight.app.exception;

public class BookingNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookingNotFoundException(String s) {
		super(s);
	} 

}
