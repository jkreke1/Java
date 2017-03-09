
public class BankCharges {

	//Store values of account balance and the number of checks written
	private double accountBalance;
	private int numChecksWritten;
	
	//constructor
	public BankCharges() {
		
	}
	//methods to set and return values for balance and number of checks
	public double getAccountBalance(){
		return accountBalance;
	}
	public void setAccountBalance(double AccountBalance){
		this.accountBalance = AccountBalance;
	}
	
	public double getNumChecksWritten(){
		return numChecksWritten;
	}
	public void setNumChecksWritten(int NumChecksWritten){
		this.numChecksWritten = NumChecksWritten;
	}
	
	//determine service fees based on account balance and number of checks written
	public double getServiceFees(){
		double fees = 10;
		
		if(accountBalance < 400){
			fees += 15;
		}
		if(numChecksWritten <= 0){
			fees += 0;
		} else if(numChecksWritten < 20){
			fees += numChecksWritten * .10;
		} else if(numChecksWritten < 40 && numChecksWritten >= 20){
			fees += numChecksWritten * .08;
		} else if(numChecksWritten < 60 && numChecksWritten >= 40){
			fees += numChecksWritten * .06;
		} else if(numChecksWritten >= 60){
			fees += numChecksWritten * .04;
		}
		
		return fees;
	}

}
