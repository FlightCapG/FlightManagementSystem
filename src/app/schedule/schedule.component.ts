import { Component, OnInit } from '@angular/core';
import { Flightschedule } from '../flightschedule';

import { ViewScheduleFlightComponent } from '../view-schedule-flight/view-schedule-flight.component';

@Component({
  selector: 'app-schedule',
  templateUrl: './schedule.component.html',
  styleUrls: ['./schedule.component.css']
})
export class ScheduleComponent {

  __FlightSchedule:ViewScheduleFlightComponent;
  f:Flightschedule=new Flightschedule('','','','');

  constructor(FlightSchedule:ViewScheduleFlightComponent)
  {
    this.__FlightSchedule = FlightSchedule;
  }

  doFormSubmit()
  {
    console.log("form submit button clicked")
    console.log(this.__FlightSchedule);
  }

  readFlightSchedule(scheduleId:string,arrivalTime:string,departureTime:string,seat:string)
  {
      console.log(scheduleId+" "+arrivalTime+" "+departureTime+" "+seat+" ");
      let scheduleFromUser:Flightschedule = new Flightschedule(scheduleId,arrivalTime,departureTime,seat);
      this.__FlightSchedule[scheduleId].submit()
  }

}

