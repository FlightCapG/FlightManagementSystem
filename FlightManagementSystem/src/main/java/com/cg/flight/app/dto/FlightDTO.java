package com.cg.flight.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
private int flightId;
private String carrierName;
private String sourceAirport;
private String destinationAirport;
private String duration;
}
