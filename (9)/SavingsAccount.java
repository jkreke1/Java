
/**
 * @author Joe Kreke
 *
 */
public class SavingsAccount extends BankAccount {

	private boolean active;	//Is account active
	
	/**
	 * Constructor calls superclass constructor
	 */
	public SavingsAccount(Double Balance, double AnnualInterest) {
		super(Balance, AnnualInterest);
	}
	
	//Determine if account balance is over 25$
	//to be considered active
	public void isActive() {
		if(this.getBalance() < 25.0){
			this.active = false;
		} else {
			this.active = true;
		}
	}
	
	//Determine if account is active before withdrawing amount
	public void withdraw(double amount) {
		this.isActive();
		if(this.active == true){
			super.withdraw(amount);
		} else {
			System.out.println("Account is not active.");
		}
	}
	
	//Determine if account is active before depositing amount
	public void deposit(double amount) {
		this.isActive();
		if(this.active == true){
			super.deposit(amount);
		} else {
			if(this.getBalance() + amount > 25){
				super.deposit(amount);
			} else {
				System.out.println("Account is not active");
			}
		}
	}
	
	//Determine service fees based on number of withdrawals made
	public void monthlyProcess() {
		if(this.getNumWithdraw() > 4){
			double newCharge = this.getMonthlyServiceCharge() + (this.getNumWithdraw() * (this.getNumWithdraw() - 4));
			this.setMonthlyServiceCharge(newCharge);
		}
		this.montlyProcess();
	}
	
}
