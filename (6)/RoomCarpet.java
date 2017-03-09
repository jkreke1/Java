import java.text.DecimalFormat;

public class RoomCarpet {

	private double carpetCost;
	private RoomDimension size;
	
	public RoomCarpet() {
		
	}
	
	public RoomCarpet(double carpetCost, RoomDimension size) {
		this.carpetCost = carpetCost;
		this.size = new RoomDimension(size);
	}

	/**
	 * @return the carpetCost
	 */
	public double getCarpetCost() {
		return carpetCost;
	}

	/**
	 * @param carpetCost the carpetCost to set
	 */
	public void setCarpetCost(double carpetCost) {
		this.carpetCost = carpetCost;
	}

	/**
	 * @return the size
	 */
	public RoomDimension getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(RoomDimension size) {
		this.size = new RoomDimension(size);
	}
	
	/**
	 * Method to calculate and return total cost of carpet
	 */
	public double getTotalCost(){
		return (size.getLength() * size.getWidth()) * carpetCost;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String outString;
		DecimalFormat formatter = new DecimalFormat("$0.00");
		outString = "Floor Information: \n" +
					 size + "\n" +
					"Floor Cost: " + formatter.format(carpetCost) + "\n" + 
					"Total Cost: " + formatter.format(this.getTotalCost());
		return outString;
	}
	

}
