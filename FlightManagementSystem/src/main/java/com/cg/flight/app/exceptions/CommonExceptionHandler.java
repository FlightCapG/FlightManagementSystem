package com.cg.flight.app.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.flight.app.dto.ExceptionDTOResponse;

@ControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ExceptionDTOResponse> invalidName(InvalidBookingException e) {
		ExceptionDTOResponse dto = new ExceptionDTOResponse();
		dto.setErrorMsg(e.toString());
		dto.setDateTime(LocalDateTime.now() + "");
		return new ResponseEntity<ExceptionDTOResponse>(dto, HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<ExceptionDTOResponse> invalidDestination(InvalidBookingException e){
		ExceptionDTOResponse dto = new ExceptionDTOResponse();
		dto.setErrorMsg(e.toString());
		dto.setDateTime(LocalDateTime.now()+"");
		return new ResponseEntity<ExceptionDTOResponse>(dto, HttpStatus.OK);
		
		
	}

}
