import java.util.Scanner;

public class PetLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Pet pet1 = new Pet();
		
		//Accept user info regarding Pet
		System.out.println("Please enter the following information: ");
		
		System.out.print("Name >> ");
		pet1.setName(keyboard.nextLine());
		System.out.print("Type >> ");
		pet1.setType(keyboard.nextLine());
		System.out.print("Age  >> ");
		pet1.setAge(keyboard.nextInt());
		
		System.out.println("Your " + pet1.getType() + ", " + pet1.getName() + ", is " + pet1.getAge() + " years old.");
		
		keyboard.close();

	}

}
