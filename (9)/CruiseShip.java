
/**
 * @author Joe Kreke
 *
 */
public class CruiseShip extends Ship {

	private int maxPassengers;	// Maximum number of passengers
	
	/**
	 * Default constructor
	 */
	public CruiseShip() {
		maxPassengers = 0;
	}
	
	/**
	 * Constructor to accept name year and number
	 * of passengers
	 * @param Name
	 * @param Year
	 * @param MaxPassengers
	 */
	public CruiseShip(String Name, String Year, int MaxPassengers) {
		super(Name, Year);
		this.maxPassengers = MaxPassengers;
	}

	/**
	 * @return the maxPassengers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/**
	 * @param maxPassengers the maxPassengers to set
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	//toString to display name year and number of passengers
	public String toString(){
		return "Name: " + this.getName() + "\n" + 
			   "Year: " + this.getYear() + "\n" + 
			   "Max Passengers: " + this.maxPassengers + "\n";
	}
}
