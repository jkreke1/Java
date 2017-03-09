import java.util.Random;
import java.text.DecimalFormat;

public class ATM_Practice {

	private double balance;
	private String transactionNumber;
	private String accountAlerts;
	
	public ATM_Practice(double Balance) {
		this.setBalance(Balance);
		this.setTransactionNumber();
		this.setAccountAlerts();
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double Balance) {
		this.balance = Balance;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}
	private void setTransactionNumber() {
		DecimalFormat formatter = new DecimalFormat("00000");
		Random randomNumbers = new Random();
		transactionNumber = "" + formatter.format(randomNumbers.nextInt(100) * 999);
		
	}

	public String getAccountAlerts() {
		return accountAlerts;
	}
	public void setAccountAlerts() {
		if(this.getBalance() < 0){
			this.accountAlerts = "Alert! You have a negative balance!\n";
		} else {
			this.accountAlerts = "\n";
		}
	}
	
	public void displayAccountInfo() {
		System.out.println("*****Transaction*****\n" 
						   + "Transaction Number: " + this.getTransactionNumber() + "\n"
						   + "Account Balance: " + this.getBalance() + "\n" 
						   + this.getAccountAlerts()
						   + "*********************\n");
	}
	
	

}
