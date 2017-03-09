import java.util.Scanner;

public class Launcher_Practice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		ATM_Practice atm1 = new ATM_Practice(456.32);
		ATM_Practice atm2 = new ATM_Practice(542.14);
		ATM_Practice atm3 = new ATM_Practice(-325.14);
		ATM_Practice atm4 = new ATM_Practice(214.87);
		
		keyboard.close();
				
		atm1.displayAccountInfo();
		atm2.displayAccountInfo();
		atm3.displayAccountInfo();
		atm4.displayAccountInfo();	

	}

}
