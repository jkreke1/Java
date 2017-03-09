import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AreaLauncher {

	public static void main(String[] args) {
		int userChoice;
		int userContinue;
		float radius = 0;
		double height = 0;
		double width = 0;
		double area;
		
		DecimalFormat formatter = new DecimalFormat("#.##");
		
		do{
			
			String[] options = {"Circle", "Rectangle", "Cylinder"}; //String array holds values of choices available in OptionDialog
			userChoice = JOptionPane.showOptionDialog(null, "Click on a shape to determine the area.",
															"Choose a Shape",
															JOptionPane.DEFAULT_OPTION,
															JOptionPane.INFORMATION_MESSAGE,
															null, options, options[0]);
			switch(userChoice){ //Switch determining which shape to find area of based on OptionDialog input
			case (0):
			do{
				radius = Float.parseFloat(JOptionPane.showInputDialog("Enter a number for the radius."));
				if(radius <= 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(radius <= 0);
			area = Area.getArea(radius); //Find area of circle
			JOptionPane.showMessageDialog(null, "The area for your circle is " + formatter.format(area)); //Display area of circle
			break;
			
			case(1):
			do{
				height = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for the height.")); //User input for length
				if(height <= 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(height <= 0);
			do{
				width = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for the width.")); //User input for width
				if(width <= 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(width <= 0);
			area = Area.getArea(height, width); //Find area of rectangle
			JOptionPane.showMessageDialog(null, "The area for your rectangle is " + formatter.format(area)); //Display area of rectangle
			break;
			
			case(2):
			do{
				radius = Float.parseFloat(JOptionPane.showInputDialog("Enter a number for the radius.")); //User input for radius
				if(radius <= 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(radius <= 0);
			do{
				height = Double.parseDouble(JOptionPane.showInputDialog("Enter a number for the height.")); //UserInput for height
				if(radius <= 0){ //Input validation
					JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
				}
			}while(radius <= 0);
			area = Area.getArea(radius, height); //Find area of cylinder
			JOptionPane.showMessageDialog(null, "The area for your cylinder is " + formatter.format(area)); //Display area of cylinder
			break;
			}
			
			userContinue = JOptionPane.showConfirmDialog(null, "Would you like to go again?"); //Ask to continue running program
		}while(userContinue == 0);
	}

}
