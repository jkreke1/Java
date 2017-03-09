
public class HotelOccupancy {

	private double numRooms;
	private double numOccupied;
	private double occupancyRate;
	
	public HotelOccupancy() {
		
	}

	/**
	 * @return the numRooms
	 */
	public double getNumRooms() {
		return numRooms;
	}

	/**
	 * @param numRooms the numRooms to set
	 */
	public void setNumRooms(double numRooms) {
		this.numRooms = numRooms;
	}

	/**
	 * @return the numOccupied
	 */
	public double getNumOccupied() {
		return numOccupied;
	}

	/**
	 * @param numOccupied the numOccupied to set
	 */
	public void setNumOccupied(double numOccupied) {
		this.numOccupied = numOccupied;
	}
	
	/**
	 * return occupancy rate
	 */
	public double getOccupancyRate(){
		return occupancyRate;
	}
	
	/**
	 *  Calculate the occupancy rate of the hotel
	 *  occupancy rate = number of rooms occupied / number of rooms
	 */
	public void setOccupancyRate(){
		this.occupancyRate = numOccupied / numRooms;
	}
	
	/**
	 * Display hotel information including number of floors,
	 * number of rooms total, and occupancy rate
	 * @param numRooms
	 */
	/*public void displayHotelInfo(int numRooms){
		String outString = "";
		outString += "*******Hotel Information*******\n" + "\n" + 
				     "Number of Rooms: " + numRooms + "\n" + 
				     "Number of Rooms Occupied: " + numOccupied + "\n" + 
				     "Number of Rooms Vacant: " + (numRooms - numOccupied) + "\n" + 
				     "Occupancy Rate: " + occupancyRate;
	}*/

}
