
public class Person {
	//Fields
	private String name;
	private String address;
	private String phoneNumber;

	//Constructor
	public Person(){
		
	}
	
	public Person(String Name, String Address, String PhoneNumber) {
		this.name = Name;
		this.address = Address;
		this.phoneNumber = PhoneNumber;
	}
	
	//Properties
	public String getName(){
		return name;
	}
	public void setName(String Name){
		this.name = Name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String Address){
		this.address = Address;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber){
		this.phoneNumber = PhoneNumber;
	}

}
