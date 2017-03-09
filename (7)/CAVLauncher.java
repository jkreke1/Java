import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class CAVLauncher {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput;
		
		userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter your account number: "));
		if(CAV.validateAccount(userInput)){ // Run method to search for user-input number
			JOptionPane.showMessageDialog(null, "Account number is valid");// Account number was found in array
		} else{
			JOptionPane.showMessageDialog(null, "Account number is invalid. No hackers allowed!");// Account number was not found
		}
		

	}

}
