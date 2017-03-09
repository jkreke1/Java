
public class Area {
	
	public Area() {
		
	}

	/**
	 * Calculate area for circle
	 */
	public static double getArea(float Radius){
		double area;
		area = Math.PI * (Radius * Radius);
		
		return area;
	}
	/**
	 * Calculate area for rectangle
	 */
	public static double getArea(double Height, double Width){
		double area;
		area = Height * Width;
		
		return area;
	}
	/**
	 * Calculate area for cylinder
	 */
	public static double getArea(float Radius, double Height){
		double area;
		area = Math.PI * (Radius * Radius) * Height;
		
		return area;
	}

}
