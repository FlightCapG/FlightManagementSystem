export class Flightschedule {
    
      scheduleId: string;
      seat: string;
      arrivalTime: string;
      departureTime: string;
    
    

    constructor(
        scheduleId: string,
        seat: string,
        arrivalTime: string,
        departureTime: string,
        
    ) {
        this.scheduleId= scheduleId ;
        this.seat = seat;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
        

    }
}
