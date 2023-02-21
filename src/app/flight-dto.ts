export class FlightDTO {
    flightId:number;
    carrierName:string;
    sourceAirport:string;
    destinationAirport:string;
    duration:number;

    constructor(
        flightId:number,
        carrierName:string,
        sourceAirport:string,
        destinationAirport:string,
        duration:number
    )
    {
        this.flightId=flightId;
        this.carrierName=carrierName;
        this.sourceAirport=sourceAirport;
        this.destinationAirport=destinationAirport;
        this.duration=duration;
    }  
}
