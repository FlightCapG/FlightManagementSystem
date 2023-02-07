package com.cg.flight.app.dto;

import java.util.Date;
import lombok.Data;
@Data
public class BookingResponseDTO {
private String msg;
private int bookingId;
private int noOfPassengers;
private double ticketCost;
private String destination;
}

