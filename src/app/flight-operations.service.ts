import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Flight } from './flight';
import { FlightDTO } from './flight-dto';

@Injectable({
  providedIn: 'root'
})
export class FlightOperationsService {

  baseURL:string = 'http://localhost:9090';
  flightByCarrierNameEndPoint:string=this.baseURL+'/flight/cn';

  flightArr:Flight[] = [];

  constructor(private http:HttpClient) { 

    console.log("Inside Constructor "+this.flightByCarrierNameEndPoint);

  }

  getFlightByCarrierName(carrierName:string):Observable<FlightDTO[]>{
    console.log("Inside Method 1 "+this.flightByCarrierNameEndPoint);
    this.flightByCarrierNameEndPoint=this.flightByCarrierNameEndPoint+'/'+carrierName;
    console.log("After adding name 2 "+this.flightByCarrierNameEndPoint);

    return this.http.get<FlightDTO[]>(`${this.flightByCarrierNameEndPoint}`);
  }





  addFlight(flightFromUser:Flight)
  {
    
    this.flightArr.push(flightFromUser); 
    console.log("Inside Flight Service : Flight Added "+flightFromUser.carrierName);
    console.log(" Total Flight Are :- "+this.flightArr.length);
    
  }
  
  getFlightArr():Flight[]
  {
    return this.flightArr;
  }

  

}


