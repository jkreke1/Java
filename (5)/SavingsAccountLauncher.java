import javax.swing.JOptionPane;

public class SavingsAccountLauncher {

	public static void main(String[] args) {
		double userInput;
		double accountInput;
		int deposits = 0;
		int withdrawals = 0;
		
		//Accept user input for account balance
		userInput = Double.parseDouble(JOptionPane.showInputDialog("Please enter the current balance of your account."));
		
		//Create new account object
		SavingsAccount account1 = new SavingsAccount(userInput);
		
		//Accept and verify user input for number of months active
		do{
			userInput = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of months the account is active."));
			if(userInput < 1){
				JOptionPane.showMessageDialog(null, "Please input a number greater than 0");
			}
		}while(userInput < 1);
		
		//Loop to accept user input for amounts deposited and withdrawn
		//over the previously entered number of months
		for(int i = 1; i <= userInput; i++){
			do{
				accountInput = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount deposited in month " + i));
				//Verify user input
				if(accountInput < 0){
					JOptionPane.showMessageDialog(null, "Please input a number 0 or greater.");
				}
				//Increment number of deposits if valid input
				if(accountInput > 0){
					deposits++;
				}
			}while(accountInput < 0);
			//Add deposit amount to balance
			account1.addDeposit(accountInput);
			
			do{
				accountInput = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount withdrawn in month " + i));
				//Verify user input
				if(accountInput < 0){
					JOptionPane.showMessageDialog(null, "Please input a number 0 or greater.");
				}
				//Increment number of withdrawals if valid input
				if(accountInput > 0){
					withdrawals++;
				}
			}while(accountInput < 0);
			//Subtract withdrawal amount from balance
			account1.subtractWithdrawal(accountInput);
		}
		//Call method to add monthly interest to balance
		account1.addMonthlyInterest();
		
		//Call method to display account information
		account1.displayAccountInfo(deposits, withdrawals, userInput);

	}

}
