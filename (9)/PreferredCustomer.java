
/**
 * @author Joe Kreke
 *
 */
public class PreferredCustomer extends Customer{

	double amountOfPurchase;
	double discountLevel;
	
	/**
	 * Default constructor
	 */
	public PreferredCustomer() {
		
	}
	
	/**
	 * Constructor
	 * @param CustomerNumber
	 * @param MailingList
	 * @param Name
	 * @param Address
	 * @param Number
	 * @param AmountOfPurchase
	 */
	public PreferredCustomer(int CustomerNumber, boolean MailingList, String Name, String Address, String Number, double AmountOfPurchase) {
		super(CustomerNumber, MailingList, Name, Address, Number);
		this.amountOfPurchase = AmountOfPurchase;
		this.setDiscountLevel();
	}

	/**
	 * @return the amountOfPurchase
	 */
	public double getAmountOfPurchase() {
		return amountOfPurchase;
	}

	/**
	 * @param amountOfPurchase the amountOfPurchase to set
	 */
	public void setAmountOfPurchase(double amountOfPurchase) {
		this.amountOfPurchase = amountOfPurchase;
	}

	/**
	 * @return the discountLevel
	 */
	public double getDiscountLevel() {
		return discountLevel;
	}

	/**
	 * @param discountLevel the discountLevel to set
	 */
	public void setDiscountLevel() {
		if(this.amountOfPurchase >= 2000)
			this.discountLevel = .10;
		else if(this.amountOfPurchase >= 1500)
			this.discountLevel = .07;
		else if(this.amountOfPurchase >= 1000)
			this.discountLevel = .06;
		else if(this.amountOfPurchase >= 500)
			this.discountLevel = .05;
	}
	
	/**
	 * toString displaying name, address, phone number,
	 * customer number, on mailing list, and amount of purchase
	 */
	public String toString() {
		return "Name: " + this.getName() + "\n" + 
			   "Address: " + this.getAddress() + "\n" + 
			   "Phone Number: " + this.getPhoneNumber() + "\n" + 
			   "Customer Number: " + this.getCustomerNumber() + "\n" + 
			   "On Mailing List: " + this.isMailingList() + "\n" + 
			   "Amount of Purchase: " + this.getAmountOfPurchase() + "\n" + 
			   "Discount Level: " + this.getDiscountLevel() + "\n";
	}
}
