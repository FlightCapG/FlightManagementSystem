import { Component } from '@angular/core';
import { Flight } from '../flight';
import { FlightOperationsService } from '../flight-operations.service';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent {
  __flightService:FlightOperationsService;

  f:Flight= new Flight(101,'Empire','Pune','Mumbai',3,250,10,'','');

  constructor(flightService:FlightOperationsService)
  {
    this.__flightService = flightService;
  }

  readFlight(flightId:string,carrierName:string,sourceAirport:string,destinationAirport:string,duration:string,price:string,discount:string,about:string,image:string)
  {
      console.log(flightId+" "+carrierName+" "+sourceAirport+" "+destinationAirport+" "+duration+" "+price+" "+discount+" "+about+" "+image);
      let flightFromUser:Flight = new Flight(parseInt(flightId),carrierName,sourceAirport,destinationAirport,parseInt(duration),parseInt(price),parseInt(discount),image,about);
      this.__flightService.Submit(flightFromUser);
  }
  ngOnInit(){

  }
  doFormSubmit()
  {
   this.__flightService.Submit(this.f);
   console.log(this.f);
  }
  
  
} 


