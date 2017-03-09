
public class RetailItem {

	//Fields
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem() {
		
	}
	
	//Properties
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
