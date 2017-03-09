import java.text.DecimalFormat;

public class ParkingTicket {

	private ParkingMeter parkingMeter;
	private ParkedCar parkedCar;
	private PoliceOfficer policeOfficer;
	
	public ParkingTicket() {
		
	}
	
	/**
	 * @param parkingMeter
	 * @param parkedCar
	 * @param policeOfficer
	 */
	public ParkingTicket(ParkingMeter parkingMeter, ParkedCar parkedCar, PoliceOfficer policeOfficer) {
		this.parkingMeter = new ParkingMeter(parkingMeter);
		this.parkedCar = new ParkedCar(parkedCar);
		this.policeOfficer = new PoliceOfficer(policeOfficer);
	}
	
	public ParkingTicket(ParkingTicket parkingTicket){
		this.parkingMeter = new ParkingMeter(parkingTicket.parkingMeter);
		this.parkedCar = new ParkedCar(parkingTicket.parkedCar);
		this.policeOfficer = new PoliceOfficer(parkingTicket.policeOfficer);
	}

	/**
	 * Returns a string with the object's make, model,
	 * license number, and number of minutes parked
	 * @param parkedCar
	 * @return
	 */
	public String getParkedCarReport(){
		return new ParkedCar(parkedCar).toString();
	}
	
	public String getPoliceOfficerReport(){
		return new PoliceOfficer(policeOfficer).toString();
	}
	
	/**
	 * Returns a string with the parking fine
	 * @return
	 */
	public String getParkingFine(){
		DecimalFormat formatter = new DecimalFormat("$0.00");
		double fine = 0.0; //Fine of the illegally parked car
		String str = "The car is not parked illegally; there is no fine.";
		//Determine how many minutes over the car has parked
		double minutesOver = parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased();
		//Determine if the car is illegally parked
		if(parkedCar.getNumMinutesParked() > parkingMeter.getNumMinutesPurchased()){
			fine += 25.0; //base fine for the first hour
		}
		if( minutesOver > 60.0){
			/* Calculate the number of hours that the car is illegally parked and multiply
			the (minutesOver - 1 * 10) */
			fine += (Math.ceil((minutesOver - 60.0) / 60.0) * 10.0);

		}
		//Change the default result if there is a fine
		if(fine > 0.0){
			str = "Fine: " + formatter.format(fine);
		}
		return str;
	}
	
}
