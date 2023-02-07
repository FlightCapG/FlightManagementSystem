package com.cg.flight.app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvalidPassengerException extends Exception{
              
              String message;

              @Override
              public String toString() {
                             return "InvalidPassengerException [message=" + message + "]";
              }
              
              

}

