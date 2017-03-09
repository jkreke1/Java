/**
 * 
 */

/**
 * @author ShadowRun300
 *
 */
public class AccountLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount account1 = new SavingsAccount(13.0, .10);
		
		System.out.println(account1.getBalance());
		
		account1.deposit(17);
		
		System.out.println(account1.getBalance());

	}

}
