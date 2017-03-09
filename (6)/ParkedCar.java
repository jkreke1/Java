
public class ParkedCar {

	private String make, 			//The make of the vehicle
				   model,			//The model of the vehicle
				   licenseNum;		//The license number of the vehicle
	private double numMinutesParked;//The number of minutes the vehicle has been parked
	
	/**
	 * No-arg constructor to initialize
	 */
	public ParkedCar() {
		//Initialize the instance fields
		this.make = "";
		this.model = "";
		this.licenseNum = "";
		this.numMinutesParked = 0.0;
	}
	
	/**
	 * Constructor that sets all the field values
	 * @param make
	 * @param model
	 * @param licenseNum
	 * @param numMinutesParked
	 */
	public ParkedCar(String make, String model, String licenseNum, double numMinutesParked) {
		this.make = make;
		this.model = model;
		this.licenseNum = licenseNum;
		this.numMinutesParked = numMinutesParked;
	}
	
	/**
	 * Copy constructor to copy a ParkedCar object
	 * @param object2
	 */
	public ParkedCar(ParkedCar object2){
		this.make = object2.make;
		this.model = object2.model;
		this.licenseNum = object2.licenseNum;
		this.numMinutesParked = object2.numMinutesParked;
	}
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the licenseNum
	 */
	public String getLicenseNum() {
		return licenseNum;
	}

	/**
	 * @param licenseNum the licenseNum to set
	 */
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	/**
	 * @return the numMinutesParked
	 */
	public double getNumMinutesParked() {
		return numMinutesParked;
	}

	/**
	 * @param numMinutesParked the numMinutesParked to set
	 */
	public void setNumMinutesParked(double numMinutesParked) {
		this.numMinutesParked = numMinutesParked;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str;
		str = "Make: " + this.make + "\n" +
				"Model: " + this.model + "\n" + 
				"License Number: " + this.licenseNum + "\n" + 
				"Number of Minutes Parked: " + this.numMinutesParked;
		return str;
	}

}
