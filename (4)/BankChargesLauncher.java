//import packages used for user input
import javax.swing.JOptionPane; 
import java.text.DecimalFormat;

public class BankChargesLauncher {

	public static void main(String[] args) {
		//store user input
		double userInput;
		
		//DecimalFormat class instance for formatting money
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		
		BankCharges charge1 = new BankCharges();
		
		//prompt user to input values
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is your beginning balance?"));
		charge1.setAccountBalance(userInput);
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("How many checks did you write?"));
		charge1.setNumChecksWritten((int)userInput);
		
		//run methods to calculate service fees and display results
		JOptionPane.showMessageDialog(null, "Beginning Account Balance: " + formatter.format(charge1.getAccountBalance()) + "\n" + 
				"Number of Checks Written: " + (int)charge1.getNumChecksWritten() + "\n" + 
				"Service Fees: " + formatter.format(charge1.getServiceFees()) + "\n" + 
				"New Account Balance: " + formatter.format((charge1.getAccountBalance() - charge1.getServiceFees())));
		
		System.exit(0);

	}

}
