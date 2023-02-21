import { Component } from '@angular/core';
import { Flight } from '../flight';
import { FlightDTO } from '../flight-dto';
import { FlightOperationsService } from '../flight-operations.service';

@Component({
  selector: 'app-view-flight',
  templateUrl: './view-flight.component.html',
  styleUrls: ['./view-flight.component.css']
})
export class ViewFlightComponent {

  allFlight:FlightDTO[]=[];

  constructor(private flightService:FlightOperationsService)
  {

  }

  getFlight(carrierName:string){
    this.flightService.getFlightByCarrierName(carrierName).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allFlight = data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );
  }


  
 

}


