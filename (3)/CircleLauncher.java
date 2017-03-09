import java.util.Scanner;

public class CircleLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Circle circle1 = new Circle();
		//Accept user input for radius
		System.out.print("Enter the radius of a circle >> ");
		circle1.setRadius(keyboard.nextDouble());
		System.out.printf("Radius: %.2f\nArea: %.2f\nDiameter: %.2f\nCircumference: %.2f",
				circle1.getRadius(), circle1.getArea(), circle1.getDiameter(), circle1.getCircumerence());
		
		keyboard.close();

	}

}
