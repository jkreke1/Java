
public class RoomDimension {

	private double length;
	private double width;
	
	public RoomDimension() {
		this.length = 0;
		this.width = 0;
	}
	
	public RoomDimension(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public RoomDimension(RoomDimension object2) {
		this.length = object2.length;
		this.width = object2.width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String stringOut;
		
		stringOut = "Room Length: " + length + "\n" +
					"Room Width: " + width;
		
		return stringOut;
	}

}
