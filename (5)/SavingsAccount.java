import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SavingsAccount {

	private double annualInterestRate = .05;
	private double balance;
	
	public SavingsAccount(double Balance) {
		this.setBalance(Balance);
	}

	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Method to subtract the amount of a withdrawal
	 * from the balance
	 */
	
	public void subtractWithdrawal(double Amount){
		double withdrawalAmount = Amount;
		this.balance -= withdrawalAmount;
	}
	
	/**
	 * Method to add the amount of a deposit
	 * to the balance
	 */
	
	public void addDeposit(double Amount){
		double depositAmount = Amount;
		this.balance += depositAmount;
	}
	
	/**
	 * Method to add the amount of monthly interest
	 * to the balance
	 * monthly interest rate = annual interest rate / 12 
	 */
	
	public void addMonthlyInterest(){
		double monthlyInterest = this.annualInterestRate / 12;
		this.balance = (monthlyInterest * this.balance) + this.balance;
	}
	
	/**
	 * Method to display account information at the end
	 * of the time period
	 */
	
	public void displayAccountInfo(int NumDeposits, int NumWithdrawals, double Months){
		String outMessage = "";
		int numDeposits = NumDeposits;
		int numWithdrawals = NumWithdrawals;
		double totalInterest = ((this.annualInterestRate / 12) * this.balance) * Months;
		
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		
		outMessage += "*******Account Info*******\n" +
					  "Ending Balance: " + formatter.format(this.balance) + "\n" + 
					  "Number of Deposits: " + numDeposits + "\n" + 
					  "Number of Withdrawals: " + numWithdrawals + "\n" +
					  "Total Interest Earned: " + formatter.format(totalInterest);
		
		JOptionPane.showMessageDialog(null, outMessage);
	}

}
