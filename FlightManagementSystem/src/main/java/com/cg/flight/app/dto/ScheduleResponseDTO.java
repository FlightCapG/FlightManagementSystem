package com.cg.flight.app.dto;

import lombok.Data;
@Data
public class ScheduleResponseDTO {
private String msg;
private int scheduleId;
private int availableseat;
private String arrivalTime;
private String departureTime;
}

