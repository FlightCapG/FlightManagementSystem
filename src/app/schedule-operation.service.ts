import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Flightschedule } from './flightschedule';
import { Flightscheduledto } from './flightscheduledto';

@Injectable({
  providedIn: 'root'
})
export class FlightOperationsService {

  baseURL: string='http://localhost:9090';
  ScheduleByArrivaltimeEndPoint: string=this.baseURL+'\FlightSchedule\cn';

  FlightScheduleArr:Flightschedule[]=[];

  constructor(private http:HttpClient){

  }
    getScheduleByArrivaltime(arrivalTime:string):Observable<Flightscheduledto[]>{
    console.log("inside method 1" +this.ScheduleByArrivaltimeEndPoint);
    this.ScheduleByArrivaltimeEndPoint= this.ScheduleByArrivaltimeEndPoint+'/'+arrivalTime;
    console.log("after getting review 2"+ this.ScheduleByArrivaltimeEndPoint);

    return this.http.get<Flightscheduledto[]>('${this.ScheduleByArrivaltimeEndPoint}');
  }
  
  FlightSchedule(flightscheduleFromUser: Flightschedule)
  {
    this.FlightScheduleArr.push(flightscheduleFromUser);
    console.log("Inside Flight Schedule Service: Flight Schedule Added"+ flightscheduleFromUser.arrivalTime);
    console.log("total no of flight schedule are:- "+this.FlightScheduleArr.length);
  }
  getFlightScheduleArr():Flightschedule[]
  {
    return this.FlightScheduleArr;
  }

}