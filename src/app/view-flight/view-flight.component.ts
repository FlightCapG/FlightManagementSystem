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

  allFlights:FlightDTO[]=[];

  constructor(private flightService:FlightOperationsService)
  {
    console.log("All Flight List")
    flightService.getAllFlightFromSpring().subscribe(
      data=>{
        this.allFlights=data;
      },
      err=>{
        console.log("Error "+err);
      }
    );

}
  getFlightByCarrier(carrierName:string){
    this.flightService.getFlightByCarrierName(carrierName).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allFlights = data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );
  }

    getFlightBySource(sourceAirport:string){
      this.flightService.getFlightBySourceAirport(sourceAirport).subscribe(
        data=>{
          console.log("data :- "+data);
          
          this.allFlights = data;
        },err=>{
          console.log("error from spring ",err);
    
        } 
      );
  }
  getFlightByDestination(destinationAirport:string){
    this.flightService.getFlightByDestinationAirport(destinationAirport).subscribe(
      data=>{
        console.log("data :- "+data);
        
        this.allFlights= data;
      },err=>{
        console.log("error from spring ",err);
  
      } 
    );
}
}







// getFlight(id:string){
//     let flightId:number=parseInt(id);
//     this.flightService.getFlightById(flightId).subscribe(
//       data=>{
//         console.log("data :-"+data);
//         this.allFlight=data;
//       },err=>{
//         console.log("error from spring", err);
//       }
//     );

//   }


// getAllFlights(){
//   this.flightService.getAllFlight().subscribe(
//     data=>{
//       console.log("data :-"+data);
//       this.allFlight=data;
//     },err=>{
//       console.log("error from spring", err);
//     }
//   );
// }

  // getFlight(abc:string){
  //   let flightId:number=parseInt(abc);
  //   this.flightService.getFlightById(flightId).subscribe(
  //     data=>{
  //       console.log("data :-"+data);
  //       this.allFlight=data;
  //     },err=>{
  //       console.log("error from spring", err);
  //     }
  //   );
  // }

