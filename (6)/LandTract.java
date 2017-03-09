
public class LandTract {

	private double length;
	private double width;
	
	public LandTract() {
		length = 0;
		width = 0;
	}
	
	public LandTract(double length, double width){
		this.length = length;
		this.width = width;
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
	
	/**
	 * Method to return the area
	 */
	public double getArea(){
		double area = 0;
		
		area = length * width;
		
		return area;
	}
	
	/**
	 * equals method to determine if the areas of two tracts
	 * of land are the same
	 */
	public boolean equals(LandTract object2){
		boolean isEqual;
		
		if(this.getArea() == object2.getArea()){
			isEqual = true; //The area of land is equal
		} else {
			isEqual = false; // The area of land is not equal
		}
		
		return isEqual;
	}
	
	/**
	 * toString method
	 */
	public String toString(){
		String outString;
		outString = "Tract length: " + length + "\n" + 
					"Tract width: " + width + "\n" + 
					"Tract area: " + this.getArea();
		return outString;
	}

}
