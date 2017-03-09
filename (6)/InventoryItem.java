
public class InventoryItem {

	//Fields
	private String description;
	private int units;
	
	public InventoryItem() {
		
	}
	
	//Copy Constructor
	public InventoryItem(InventoryItem item2) {
		description = item2.description;
		units = item2.units;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}

	/**
	 * @param units the units to set
	 */
	public void setUnits(int units) {
		this.units = units;
	}
	

}
