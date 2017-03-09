
public class AccountLauncher {

	public static void main(String[] args) {
		Account account1 = new Account("Jack", "Reacher", "511 Somewhere Blvd", "Someplace", "Arkansas", 23443, "541-985-6541", true, 2343.45, "check");
		Account account2 = new Account("Lincoln", "Rhyme", "423 Falcon Ave", "St. Louis", "MO", 63113, "314-256-5687", true, 7542.35, "save");
		Account account3 = new Account("Robert", "Langdon", "512 Omen Lane", "Symbolic", "NY", 77777, "524-653-1245", false, 23.14, "invest");
		Account account4 = new Account("Odd", "Thomas", "3312 Bodachs Street", "Pico Mundo", "CA", 59254, "826-333-7757", false, -123.14, "match");
		
		account1.displayCustomerInfo();
		account2.displayCustomerInfo();
		account3.displayCustomerInfo();
		account4.displayCustomerInfo();

	}

}
