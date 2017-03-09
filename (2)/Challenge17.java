import java.util.Scanner;

public class Challenge17 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//array to hold info
		String[] info = {"Name", "Age", "City", "College", "Profession", "Animal", "Pet Name"};
		
		
		//accept user information
		System.out.println("Please enter the following information: ");
		for(int x = 0; x < 7; x++){
			System.out.print(info[x] + " >> ");
			info[x] = keyboard.nextLine();
		}
		
		//display story
		System.out.printf("There once was a person named %s who lived in %s. At the age of %s, %s went to college at %s. \n"
				+ "%s graduated and went to work as a %s. Then, %s adopted a(n) %s named %s. They both lived happily ever after."
				, info[0], info[2], info[1], info[0], info[3], info[0], info[4], info[0], info[5], info[6]);
		
		
		keyboard.close();

	}

}
