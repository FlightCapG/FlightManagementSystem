package com.cg.flight.app.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
public class InvalidFlightException extends Exception{
String message;
@Override
public String toString() {
return "InvalidFlightException [message=" + message + "]";
}
}

