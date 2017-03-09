

/**
 * @author Joe Kreke
 *
 */
public class CAV {

	private static int[] accounts = 
		{5658845, 4520125, 7895122, 8777541, 8451277, 1302850,					  		 
		 8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
		 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
	
	/**
	 * 
	 */
	public CAV() {
		
	}
	
	/**
	 * @return the accounts
	 */
	public static int[] getAccounts() {
		return accounts;
	}


	/**
	 * @param accounts the accounts to set
	 */
	public static void setAccounts(int[] accounts) {
		CAV.accounts = accounts;
	}


	/**
	 * Binary search for account number
	 */
	public static boolean validateAccount(int accountNum){
		boolean isValid = false;
		int first = 0,
			last = accounts.length - 1,
			middle;
		
		CAV.sort(accounts);
		
		while(!isValid && first <= last){
			//Calculate midpoint
			middle = (first + last) / 2; 
			if(accounts[middle] == accountNum){
				isValid = true;
			}else if(accounts[middle] > accountNum){
				//If accountNumber is in lower half
				last = middle - 1;	
			}else {
				//If accountNumber is in upper half
				first = middle + 1;	
			}
		}
		
		return isValid;
	}
	
	/**
	 * Sort array for binary search
	 */
	public static void sort(int[] array){
		int minIndex, 	//Index of lowest value found
			minValue;	//Lowest value found
		
		//Loop to go through array and find number to compare
		for(int i = 0; i < (array.length - 1); i++){
			minIndex = i;
			minValue = array[i];
			//Loop to go through array and compare items to current working value
			for(int n = i + 1; n < array.length; n++){
				//If compared value is lower than current value,
				//set compared value to new lowest value
				if(array[n] < minValue){
					minValue = array[n];
					minIndex = n;
				}
			}
			//Move current working index value to the index of the lowest value
			//then put current low value into the empty index
			array[minIndex] = array[i];
			array[i] = minValue;
		}
	}

}
