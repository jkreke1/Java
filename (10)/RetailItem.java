
public class RetailItem {

	private String description;	//Item description
	private int unitsOnHand;	//number of units on hand
	private double price;		//price of each unit
	
	/**
	 * Default constructor
	 */
	public RetailItem() {
		this.description = "";
		this.unitsOnHand = 0;
		this.price = 0.0;
	}
	
	/**
	 * Constructor
	 * @param Description
	 * @param UnitsOnHand
	 * @param Price
	 * @throws NegativePriceException
	 * @throws NegativeUnitsException
	 */
	public RetailItem(String Description, int UnitsOnHand, double Price) throws NegativePriceException, NegativeUnitsException {
		this.description = Description;
		this.unitsOnHand = UnitsOnHand;
		this.price = Price;
		//Check if unitsOnHand is a bad value and throw exception
		if(this.unitsOnHand < 0){
			throw new NegativeUnitsException();
		}
		//Check if price is a bad value and throw exception
		if(this.price < 0){
			throw new NegativePriceException();
		}
	}
	
	
	//Getters and Setters
	public void setDescription(String Description){
		this.description = Description;
	}
	public String getDescription(){
		return description;
	}
	
	public void setUnitsOnHand(int UnitsOnHand){
		this.unitsOnHand = UnitsOnHand;
	}
	public int getUnitsOnHand(){
		return unitsOnHand;
	}
	
	public void setPrice(double Price){
		this.price = Price;
	}
	public double getPrice(){
		return price;
	}

}
