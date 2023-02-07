package com.cg.flight.app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvalidScheduleException extends Exception {

              private String msg;

              @Override
              public String toString() {
                             return "InvalidScheduleException [msg=" + msg + "]";
              }

}

