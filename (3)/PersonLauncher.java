
public class PersonLauncher {

	public static void main(String[] args) {
		//Instantiating objects in array
		Person[] people = new Person[3];
		for(int i = 0; i < people.length; i++){
			people[i] = new Person();
		}
		
		//Assigning object data
		people[0].setName("Joe Kreke");
		people[0].setAddress("Bluegrass Lane");
		people[0].setPhoneNumber("6189795144");
		
		people[1].setName("Bundt Lubster");
		people[1].setAddress("Undah da sea");
		people[1].setPhoneNumber("1234567890");
		
		people[2].setName("Fresh Princely");
		people[2].setAddress("Helicopter Lane");
		people[2].setPhoneNumber("7281128910");
		
		//Displaying object info
		for(int i = 0; i < people.length; i++){
			System.out.print(people[i].getName() + "\t\t");
			System.out.print(people[i].getAddress() + "\t\t");
			System.out.print(people[i].getPhoneNumber() + "\t\t\n");
		}

	}

}
