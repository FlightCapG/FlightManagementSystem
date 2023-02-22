export class FlightDTO {
    flightId:number;
    carrierName:string;
    sourceAirport:string;
    destinationAirport:string;
    duration:number;
    price:number;

    constructor(
        flightId:number,
        carrierName:string,
        sourceAirport:string,
        destinationAirport:string,
        duration:number,
        price:number
    )
    {
        this.flightId=flightId;
        this.carrierName=carrierName;
        this.sourceAirport=sourceAirport;
        this.destinationAirport=destinationAirport;
        this.duration=duration;
        this.price=price;
    }  
}
