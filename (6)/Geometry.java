import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class Geometry {
	
	/**
	 * Default constructor to set fields to 0
	 */
	public Geometry() {
		
	}

	/**
	 * Static method to return the area of a circle
	 */
	public static double getAreaCircle(double radius){
		if(radius < 0){
			JOptionPane.showMessageDialog(null, "Radius must be a positive number.");
			return 0;
		} else {
			return Math.PI * (radius * radius);
		}
		
	}
	
	/**
	 * Static method to return the area of a rectangle
	 */
	public static double getAreaRectangle(double length, double width){
		if(length < 0 || width < 0){
			JOptionPane.showMessageDialog(null, "Length and width must be positive numbers.");
			return 0;
		} else {
			return length * width;
		}
		
	}
	
	/**
	 * Static method to return area of a triangle
	 */
	public static double getAreaTriangle(double base, double height){
		if(base < 0 || height < 0){
			JOptionPane.showMessageDialog(null, "Base and height must be positive numbers.");
			return 0;
		} else {
			return base * height * 0.5;
		}
		
	}
}
