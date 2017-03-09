
public class Circle {

	//Fields
	private double radius;
	private final double PI = 3.14159;
	
	//Constructors and other methods
	public Circle() {
		
	}
	
	public Circle(double Radius) {
		this.radius = Radius;
	}
	
	public double getArea(){
		return PI * (radius * radius);
	}
	
	public double getDiameter(){
		return radius * 2;
	}
	
	public double getCircumerence(){
		return 2 * PI * radius;
	}
	
	//Properties
	public double getRadius(){
		return radius;
	}
	public void setRadius(double Radius){
		this.radius = Radius;
	}

}
