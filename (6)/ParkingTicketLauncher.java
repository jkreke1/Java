
public class ParkingTicketLauncher {

	public static void main(String[] args) {
		ParkedCar car = new ParkedCar("Mazda", "Miata", "LMD456", 185);
		ParkingMeter meter = new ParkingMeter(30);
		PoliceOfficer officer1 = new PoliceOfficer("Officer Joe", 45678);
		ParkingTicket ticket = new ParkingTicket(meter, car, officer1);
		PoliceOfficer officer2 = new PoliceOfficer(car, meter, ticket);
		officer2.examineCar();

	}

}
