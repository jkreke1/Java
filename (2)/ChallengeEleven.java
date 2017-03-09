import java.util.Scanner;

public class ChallengeEleven {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int numMale;
		int numFemale;
		double totalStudents;
		double percentM;
		double percentF;
		
		//Accept user input
		System.out.print("Enter the number of males >> ");
		numMale = keyboard.nextInt();
		System.out.print("Enter the number of females >> ");
		numFemale = keyboard.nextInt();
		
		totalStudents = numMale + numFemale;
		
		//Calculate percentage of male and female
		percentM = (numMale / totalStudents) * 100;
		percentF = (numFemale / totalStudents) * 100;
		
		//Print results
		System.out.println("The percentage of males in the class is " + percentM + "%");
		System.out.println("The percentage of females in the class is " + percentF + "%");
		
		keyboard.close();

	}

}
