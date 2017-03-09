
public class PoliceOfficer {

	private String name;				//Officer's name
	private int badgeNum;				//Officer's badge number
	private ParkedCar parkedCar;		//Parked car object
	private ParkingMeter parkingMeter;	//Parking meter object
	private ParkingTicket parkingTicket;//Parking ticket object
	
	/**
	 * No-arg constructor to initialize the field
	 * values
	 */
	
	public PoliceOfficer() {
		this.name = "";
		this.badgeNum = 0;
	}
	
	/**
	 * 
	 * @param name
	 * @param badgeNum
	 */
	public PoliceOfficer(String name, int badgeNum){
		this.name = name;
		this.badgeNum = badgeNum;
	}
	
	/**
	 * 
	 * @param policeOfficer
	 */
	public PoliceOfficer(PoliceOfficer policeOfficer){
		this.name = policeOfficer.name;
		this.badgeNum = policeOfficer.badgeNum;
	}

	/**
	 * 
	 * @param name
	 * @param badgeNum
	 * @param parkedCar
	 * @param parkingMeter
	 */
	public PoliceOfficer(String name, int badgeNum, ParkedCar parkedCar, ParkingMeter parkingMeter) {
		this.name = name;
		this.badgeNum = badgeNum;
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
	}
	
	public PoliceOfficer(ParkedCar parkedCar, ParkingMeter parkingMeter, ParkingTicket parkingTicket){
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
		this.parkingTicket = new ParkingTicket(parkingTicket);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the badgeNum
	 */
	public int getBadgeNum() {
		return badgeNum;
	}

	/**
	 * @param badgeNum the badgeNum to set
	 */
	public void setBadgeNum(int badgeNum) {
		this.badgeNum = badgeNum;
	}

	/**
	 * @return the parkedCar
	 */
	public ParkedCar getParkedCar() {
		return new ParkedCar(parkedCar);
	}

	/**
	 * @param parkedCar the parkedCar to set
	 */
	public void setParkedCar(ParkedCar parkedCar) {
		this.parkedCar = new ParkedCar(parkedCar);
	}

	/**
	 * @return the parkingMeter
	 */
	public ParkingMeter getParkingMeter() {
		return new ParkingMeter(parkingMeter);
	}

	/**
	 * @param parkingMeter the parkingMeter to set
	 */
	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = new ParkingMeter(parkingMeter);
	}
	
	/**
	 * @return the parkingTicket
	 */
	public ParkingTicket getParkingTicket() {
		return parkingTicket;
	}

	/**
	 * @param parkingTicket the parkingTicket to set
	 */
	public void setParkingTicket(ParkingTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}

	public void examineCar(){
		if((parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased()) > 1){
			issueParkingTicket();
		}
	}
	
	public void issueParkingTicket(){
		System.out.println("Parking Ticket" + 
				"\n*********************\n" + 
				"Car Info: " + "\n" + parkingTicket.getParkedCarReport() + "\n" +
				"Police Officer Info: " + "\n" + parkingTicket.getPoliceOfficerReport() + "\n" + 
				 parkingTicket.getParkingFine());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str;
		str = "Officer Name: " + this.name + "\n" + 
				"Badge Number: " + this.badgeNum + "\n";
		return str;
	}

}
