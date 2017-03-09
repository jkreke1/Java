import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class GeometryLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userChoice; 	//User choice of shape
		int userContinue;	//User input to continue using program
		double radius = 0;	//Stores user input of radius
		double length = 0;	//Stores user input of length
		double width = 0;	//Stores user input of width
		double base = 0;	//Stores user input of base
		double height = 0;	//Stores user input of height
		
		DecimalFormat formatter = new DecimalFormat("#.##");
		
		do{
			
			String[] options = {"Circle", "Rectangle", "Triangle"}; //String array to store options for user to choose from
			userChoice = JOptionPane.showOptionDialog(null, "Click on a shape to determine the area.",
															"Choose a Shape",
															JOptionPane.DEFAULT_OPTION,
															JOptionPane.INFORMATION_MESSAGE,
															null, options, options[0]);
			switch(userChoice){
			case (0):
			do{
				radius = Float.parseFloat(JOptionPane.showInputDialog("Enter a number for the radius.")); //Ask user for radius
				if(radius < 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(radius < 0);
			JOptionPane.showMessageDialog(null, "The area for your circle is " + formatter.format(Geometry.getAreaCircle(radius))); //Determine and display area of circle
			break;
			
			case(1):
			do{
				length = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for the length.")); //Ask user for length
				if(length < 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(length < 0);
			do{
				width = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for the width.")); //Ask user for width
				if(width < 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(width < 0);
			JOptionPane.showMessageDialog(null, "The area for your rectangle is " + formatter.format(Geometry.getAreaRectangle(length, width))); //Determine and display area of rectangle
			break;
			
			case(2):
			do{
				base = Float.parseFloat(JOptionPane.showInputDialog("Enter a number for the base.")); //Ask user for base
				if(base < 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(base < 0);
			do{
				height = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for the height.")); //Ask user for height
				if(height < 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(height < 0);
			JOptionPane.showMessageDialog(null, "The area for your triangle is " + formatter.format(Geometry.getAreaTriangle(base, height))); //Determine and display area of triangle
			break;
			}
			
			userContinue = JOptionPane.showConfirmDialog(null, "Would you like to go again?");
		}while(userContinue == 0);
	}
}
