import javax.swing.JOptionPane;

public class PenniesForPayLauncher {

	public static void main(String[] args) {
		//Local variable to hold user input for days
		int userInput;
		
		//Run program until user selects No or Cancel
		do{
			do{
				//Prompt user for number of days worked
				userInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of days worked."));
				//Input validation
				if(userInput <= 0){
					JOptionPane.showMessageDialog(null, "Number too low. Please enter a valid number.");
				}
			} while(userInput <= 0);
			//Create object
			PenniesForPay pay1 = new PenniesForPay(userInput);
			//Run method to determine and print daily salary
			pay1.getDailySalary();
			
		}while(JOptionPane.showConfirmDialog(null, "Would you like to go again?") == 0);
		
		System.exit(0);

	}

}
