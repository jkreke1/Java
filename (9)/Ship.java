
/**
 * @author Joe Kreke
 *
 */
public class Ship {

	private String name;	//Name of the ship
	private String year;	//Year the ship was made
	
	/**
	 * Default constructor
	 */
	public Ship() {
		name = "";
		year = "";
	}
	
	/**
	 * Constructor to accept name and year
	 * @param Name
	 * @param Year
	 */
	public Ship(String Name, String Year) {
		this.name = Name;
		this.year = Year;
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
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	/**
	 * toString to display name and year
	 */
	public String toString(){
		return "Name: " + this.name + "\n" + 
			   "Year: " + this.year + "\n";
	}

}
