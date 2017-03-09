
public class ParkingMeter {

	private double numMinutesPurchased;
	
	/**
	 * No-arg constructor to initialize fields
	 */
	public ParkingMeter() {
		numMinutesPurchased = 0.0;
	}

	/**
	 * Constructor to set the field values
	 * @param numMinutesPurchase
	 */
	public ParkingMeter(double numMinutesPurchase) {
		this.numMinutesPurchased = numMinutesPurchase;
	}
	
	/**
	 * Copy constructor to copy the passed object
	 * @param object2
	 */
	public ParkingMeter(ParkingMeter object2){
		this.numMinutesPurchased = object2.numMinutesPurchased; 
	}

	/**
	 * @return the numMinutesPurchased
	 */
	public double getNumMinutesPurchased() {
		return numMinutesPurchased;
	}

	/**
	 * @param numMinutesPurchased the numMinutesPurchased to set
	 */
	public void setNumMinutesPurchased(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str;
		str = "Number of Minutes Purchased: " + this.numMinutesPurchased;
		return str;
	}

}
