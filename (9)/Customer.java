
/**
 * @author Joe Kreke
 *
 */
public class Customer extends Person {

	int customerNumber;
	boolean mailingList;
	
	/**
	 * 
	 */
	public Customer() {
		
	}
	
	public Customer(int CustomerNumber, boolean MailingList, String Name, String Address, String Number) {
		super(Name, Address, Number);
		this.customerNumber = CustomerNumber;
		this.mailingList = MailingList;
	}

	/**
	 * @return the customerNumber
	 */
	public int getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the mailingList
	 */
	public boolean isMailingList() {
		return mailingList;
	}

	/**
	 * @param mailingList the mailingList to set
	 */
	public void setMailingList(boolean mailingList) {
		this.mailingList = mailingList;
	}
	
	public String toString() {
		return "Name: " + this.getName() + "\n" + 
			   "Address: " + this.getAddress() + "\n" + 
			   "Phone Number: " + this.getPhoneNumber() + "\n" + 
			   "Customer Number: " + this.getCustomerNumber() + "\n" + 
			   "On Mailing List: " + this.isMailingList() + "\n";
	}

}
