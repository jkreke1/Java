import javax.swing.JOptionPane;

public class SumOfNumbersLauncher {

	public static void main(String[] args) {
		int userInput = 0;
		
		//Ask user for input
		do{
			do{
				//Determine if user input is acceptable
				userInput = (int)Double.parseDouble(JOptionPane.showInputDialog("Please enter a number over 0."));
				if(userInput < 1){
					JOptionPane.showMessageDialog(null, "User input is invalid. Please try again.");
				}
				if(userInput > 100000000){
					JOptionPane.showMessageDialog(null, "Please dont try to break the program.");
				}
			} while(userInput < 1 || userInput > 100000000);
			//SumOfNumbers object instance
			SumOfNumbers sum1 = new SumOfNumbers(userInput);
			//Output window with results
			JOptionPane.showMessageDialog(null, "The total sum of numbers from 0 to " + userInput + " is " + sum1.SumRangeOfNumbers());
		} while(JOptionPane.showConfirmDialog(null, "Would you like to go again?") == 0);

		System.exit(0);
	}

}
