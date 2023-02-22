import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Flightschedule } from './flightschedule';
import { Flightscheduledto } from './flightscheduledto';

@Injectable({
  providedIn: 'root'
})
export class ScheduleOperationService {

  baseURL: string='http://localhost:9090';
  ScheduleByArrivaltimeEndPoint: string=this.baseURL+'\schedule\arrivalTime';

  FlightScheduleArr:Flightschedule[]=[];

  constructor(private http:HttpClient){

  }
    getScheduleByArrivaltime(arrivalTime:string):Observable<Flightscheduledto[]>{
    console.log("inside method 1" +this.ScheduleByArrivaltimeEndPoint);
    this.ScheduleByArrivaltimeEndPoint= this.ScheduleByArrivaltimeEndPoint+'/'+arrivalTime;
    console.log("after getting review 2"+ this.ScheduleByArrivaltimeEndPoint);

    return this.http.get<Flightscheduledto[]>('${this.ScheduleByArrivaltimeEndPoint}');
  }
  
  // flightSchedule(flightSchedule:Flightschedule):Observable<Flightscheduledto[]>{
  //   console.log("inside method 1" +this.FlightScheduleEndPoint);
  //   this.FlightScheduleEndPoint= this.FlightScheduleEndPoint+'/'+flightSchedule;
  //   console.log("after getting review 2"+ this.FlightScheduleEndPoint);

  //   return this.http.get<Flightscheduledto[]>('${this.FlightScheduleEndPoint}');
  // }
  
  submit(scheduleFromUser:Flightschedule)
  {
    
    this.FlightScheduleArr.push(scheduleFromUser); 
    console.log("Inside FlightSchedule Service : Schedule Added "+scheduleFromUser.scheduleId);
    console.log(" Total FlightSchedule Are :- "+this.getFlightScheduleArr.length);
    
  }

  getFlightScheduleArr():Flightschedule[]
  {
    return this.FlightScheduleArr;
  }

}