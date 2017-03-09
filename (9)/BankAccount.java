
/**
 * @author Joe Kreke
 *
 */
public abstract class BankAccount {

	private double balance;					//Current balance of account
	private int numDeposit;					//Number of monthly deposits
	private int numWithdraw;				//Number of monthly withdrawals
	private double annualInterest;			//Annual interest rate
	private double monthlyServiceCharge;	//Monthly service charges on account
	
	/**
	 * Default constructor
	 */
	public BankAccount() {
		
	}
	
	/**
	 * 
	 * @param Balance
	 * @param AnnualInterest
	 */
	public BankAccount(Double Balance, double AnnualInterest) {
		this.balance = Balance;
		this.annualInterest = AnnualInterest;
		this.numDeposit = 0;
		this.numWithdraw = 0;
		this.monthlyServiceCharge = 0;
	}
	
	// Deposit an amount into account
	public void deposit(double amount){
		this.balance += amount;
		this.numDeposit++;
	}
	
	//Withdraw an amount from account
	public void withdraw(double amount){
		this.balance -= amount;
		this.numWithdraw++;
	}
	
	//Determine monthly interest rate and value
	public void calcInterest(){
		double monthlyRate = this.annualInterest/12;
		double monthlyInterest = this.balance * monthlyRate;
		this.balance += monthlyInterest;
	}
	
	//Determine monthly service charges and 
	//set number of withdrawals and deposits to 0
	public void montlyProcess(){
		this.balance -= this.monthlyServiceCharge;
		this.calcInterest();
		this.numDeposit = 0;
		this.numWithdraw = 0;
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
	 * @return the numDeposit
	 */
	public int getNumDeposit() {
		return numDeposit;
	}

	/**
	 * @param numDeposit the numDeposit to set
	 */
	public void setNumDeposit(int numDeposit) {
		this.numDeposit = numDeposit;
	}

	/**
	 * @return the numWithdraw
	 */
	public int getNumWithdraw() {
		return numWithdraw;
	}

	/**
	 * @param numWithdraw the numWithdraw to set
	 */
	public void setNumWithdraw(int numWithdraw) {
		this.numWithdraw = numWithdraw;
	}

	/**
	 * @return the annualInterest
	 */
	public double getAnnualInterest() {
		return annualInterest;
	}

	/**
	 * @param annualInterest the annualInterest to set
	 */
	public void setAnnualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}

	/**
	 * @return the monthlyServiceCharge
	 */
	public double getMonthlyServiceCharge() {
		return monthlyServiceCharge;
	}

	/**
	 * @param monthlyServiceCharge the monthlyServiceCharge to set
	 */
	public void setMonthlyServiceCharge(double monthlyServiceCharge) {
		this.monthlyServiceCharge = monthlyServiceCharge;
	}

}
