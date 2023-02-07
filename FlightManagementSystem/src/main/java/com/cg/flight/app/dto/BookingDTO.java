package com.cg.flight.app.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {

              //private Date bookingDate;
              
              private int bookingId;
              
              private int noOfPassengers;
              
              private double ticketCost;

              private String destination;

}
