package com.cg.flight.app.util;

import org.springframework.stereotype.Component;

import com.cg.flight.app.dto.ScheduleDTO;
import com.cg.flight.app.dto.ScheduleResponseDTO;
import com.cg.flight.app.entity.Schedule;

@Component
public class ScheduleDTOConvertor {

              public ScheduleResponseDTO convertTo(Schedule schedule) {
                             ScheduleResponseDTO dto = new ScheduleResponseDTO();
                             dto.setScheduleId(schedule.getScheduleId());
                             dto.setArrivalTime(schedule.getArrivalTime());
                             dto.setDepartureTime(schedule.getDepartureTime());
                             dto.setAvailableseat(schedule.getAvailableseat());

                             dto.setMsg("Schedule Saved");
                             return dto;

              }

              public ScheduleDTO getScheduleDTO(Schedule schedule) {
                             return new ScheduleDTO(schedule.getScheduleId(), schedule.getArrivalTime(), schedule.getDepartureTime(),
                                                          schedule.getAvailableseat());

              }

}
