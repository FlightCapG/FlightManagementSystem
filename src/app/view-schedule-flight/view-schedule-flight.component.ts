import { Component, OnInit } from '@angular/core';
import { Flightschedule } from '../flightschedule';
import { Flightscheduledto } from '../flightscheduledto';
import { FlightOperationsService } from '../schedule-operation.service';

@Component({
  selector: 'app-view-schedule-flight',
  templateUrl: './view-schedule-flight.component.html',
  styleUrls: ['./view-schedule-flight.component.css']
})
export class ViewScheduleFlightComponent {
  FlightSchedule(flightscheduleFromUser: Flightschedule) {
    throw new Error('Method not implemented.');
  }
  // [x: string]: any;
  allFlightSchedule: Flightscheduledto[]=[];


       
  constructor(private Scheduleoperation: FlightOperationsService )
  {

  }
  getFlightSchedule(arrivalTime:string){
    this.Scheduleoperation.getScheduleByArrivaltime(arrivalTime).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allFlightSchedule = data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );
  }

}

  

