export class Flightscheduledto {
    
      scheduleId: number;
      seat: number;
      arrivalTime: string;
      departureTime: string;
      departureDate: number;

      constructor(scheduleId:number,seat: number,arrivalTime: string,departureTime: string,departureDate: number){

        this.scheduleId= scheduleId ;
        this.seat = seat;
		    this.arrivalTime = arrivalTime;
		    this.departureTime = departureTime;
        this.departureDate=departureDate;

      }
    
}
