
/**
 * @author Joe Kreke
 *
 */
public class CargoShip extends Ship {

	private int cargoCapacity;	//Tonnage of cargo that ship can hold
	
	/**
	 * Default constructor
	 */
	public CargoShip() {
		this.cargoCapacity = 0;
	}
	
	/**
	 * Constructor to accept name year and cargo limit
	 * @param Name
	 * @param Year
	 * @param CargoCapacity
	 */
	public CargoShip(String Name, String Year, int CargoCapacity) { 
		super(Name, Year);
		this.cargoCapacity = CargoCapacity;
	}
	
	/**
	 * toString to display name year and cargo capacity
	 */
	public String toString(){
		return "Name: " + this.getName() + "\n" + 
			   "Year: " + this.getYear() + "\n" + 
			   "Cargo Capacity: " + this.cargoCapacity + " tons\n";
	}
}
