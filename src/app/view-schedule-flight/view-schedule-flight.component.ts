import { Component, OnInit } from '@angular/core';
import { Flightschedule } from '../flightschedule';
import { Flightscheduledto } from '../flightscheduledto';
import { ScheduleOperationService } from '../schedule-operation.service';


@Component({
  selector: 'app-view-schedule-flight',
  templateUrl: './view-schedule-flight.component.html',
  styleUrls: ['./view-schedule-flight.component.css']
})
export class ViewScheduleFlightComponent {
  [x: string]: any;
  
  allFlightSchedule:Flightscheduledto[]=[];

  constructor(private Scheduleoperation: ScheduleOperationService)
  {

  }

  getFlightSchedule(arrivalTime:string){
    this.Scheduleoperation.getScheduleByArrivaltime(arrivalTime).subscribe(
      data=>{
        console.log("data :- "+data);
        
         this.allFlightSchedule = data;
      },
       err=>{
         console.log("error from spring ",err);
  
      } 
    );
  }

}

  

