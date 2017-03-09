import java.util.Random;
import java.text.DecimalFormat;

public class Account {

	private double balance;
	private String accountNumber;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private boolean preferredCustomer;
	private String accountType;
	private String accountNotes;
	
	public Account(String FirstName, String LastName, String StreetAddress, String City, String State, int Zip, String PhoneNumber, boolean PreferredCustomer, double balance, String AccountType) {
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setStreetAddress(StreetAddress);
		this.setCity(City);
		this.setState(State);
		this.setZip(Zip);
		this.setPhoneNumber(PhoneNumber);
		this.setPreferredCustomer(PreferredCustomer);
		this.setBalance(balance);
		this.setAccountType(AccountType);
		this.setAccountNumber();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		
		this.balance = balance;
		if(balance < 0){
			this.negativeBalanceLetter();
		} else {
			this.setAccountNotes("none");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isPreferredCustomer() {
		return preferredCustomer;
	}

	public void setPreferredCustomer(boolean preferredCustomer) {
		this.preferredCustomer = preferredCustomer;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String AccountType) {
		switch(AccountType){
			case "check":
				this.accountType = "checking";
				break;
			case "save":
				this.accountType = "savings";
				break;
			case "invest":
				this.accountType = "investment";
				break;
			default:
				this.accountType = "standard";
			
		}
	}
	
	public String getAccountNotes(){
		return accountNotes;
	}
	
	public void setAccountNotes(String AccountNotes){
		this.accountNotes = AccountNotes;
	}
	
	public void negativeBalanceLetter(){
		this.setAccountNotes("Negative balance letter has been sent.");
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	private void setAccountNumber(){
		Random randomNumbers = new Random();
		
		
		accountNumber = "" + randomNumbers.nextInt(10) + randomNumbers.nextInt(10) +
				 randomNumbers.nextInt(10) + randomNumbers.nextInt(10) +
				 randomNumbers.nextInt(10) + randomNumbers.nextInt(10) +
				 randomNumbers.nextInt(10) + randomNumbers.nextInt(10) +
				 randomNumbers.nextInt(10) + randomNumbers.nextInt(10);
	}
	
	public void displayCustomerInfo(){
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		System.out.println("***** Customer Info ***** \n" + 
						    this.getFirstName() + " " + this.getLastName() + "\n" + 
						    this.getStreetAddress() + "\n" + 
						    this.getCity() + "\n" + 
						    this.getState() + "\n" + 
						    this.getZip() + "\n" + 
						    this.getPhoneNumber() + "\n" +
						    "Preferred Customer: " + this.isPreferredCustomer() + "\n" + 
						    "Account Number: " + this.getAccountNumber() + "\n" + 
						    "Balance: " +  formatter.format(this.getBalance()) + "\n" + 
						    "Account Type: " + this.getAccountType() + "\n" + 
						    "Notes: " + this.getAccountNotes() + "\n");
	}
	

}
