
/**
 * @author Joe Kreke
 *
 */
public class Person {

	private String name,
				   address,
				   phoneNumber;
	
	/**
	 * 
	 */
	public Person() {
		
	}
	
	public Person(String Name, String Address, String Number) {
		this.name = Name;
		this.address = Address;
		this.phoneNumber = Number;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
