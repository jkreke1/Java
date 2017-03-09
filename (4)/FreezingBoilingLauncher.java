//import JOptionPane for user input
import javax.swing.JOptionPane;

public class FreezingBoilingLauncher {

	public static void main(String[] args) {
		//variable for user input temperature
		double userInput;
		
		FreezingBoiling temp1 = new FreezingBoiling();
		
		//prompt user for temperature
		userInput = Double.parseDouble(JOptionPane.showInputDialog("Please enter a temperature."));
		//run methods to set, calculate and display data
		temp1.displayInformation(userInput);

	}

}
