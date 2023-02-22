import { Component, OnInit } from '@angular/core';
import { Flightschedule } from '../flightschedule';
import { FlightOperationsService } from '../schedule-operation.service';
import { ViewScheduleFlightComponent } from '../view-schedule-flight/view-schedule-flight.component';

@Component({
  selector: 'app-schedule',
  templateUrl: './schedule.component.html',
  styleUrls: ['./schedule.component.css']
})
export class ScheduleComponent {
  ___FlightSchedule: ViewScheduleFlightComponent;

  f:Flightschedule= new Flightschedule('','','','');

  constructor(FlightSchedule:ViewScheduleFlightComponent)
  {
    this.___FlightSchedule=FlightSchedule;
  }
  doFormSubmit()
  {
    console.log("form submit button clicked")
    console.log(this.f);
    this.___FlightSchedule['FlightSchedule'](this.f);
  }
  readFlightSchedule(scheduleId:string,arrivalTime:string,departureTime:string,seat:string)
  {
    console.log(arrivalTime+" "+departureTime);
    let flightscheduleFromUser:Flightschedule=new Flightschedule(scheduleId,arrivalTime,departureTime,seat);
    this.___FlightSchedule['FlightSchedule'](flightscheduleFromUser)
  }
  

}