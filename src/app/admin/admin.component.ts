import { Component } from '@angular/core';
import { Flight } from '../flight';
import { FlightOperationsService } from '../flight-operations.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
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
      this.__flightService.addFlight(flightFromUser);
  }
  ngOnInit(){

  }
  doFormSubmit()
  {
   this.__flightService.addFlight(this.f);
   console.log(this.f);
  }
  
  
} 



