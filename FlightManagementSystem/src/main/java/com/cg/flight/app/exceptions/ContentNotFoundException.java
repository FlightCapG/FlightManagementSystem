package com.cg.flight.app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentNotFoundException extends Exception {

	String msg;

	@Override
	public String toString() {
		return "InvalidContentException [message=" + msg + "]";
	}

}