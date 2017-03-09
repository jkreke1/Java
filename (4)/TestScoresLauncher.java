import java.util.Scanner;

public class TestScoresLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double test1;
		double test2;
		double test3;
		
		System.out.println("Enter three test scores: ");
		test1 = keyboard.nextDouble();
		test2 = keyboard.nextDouble();
		test3 = keyboard.nextDouble();
		
		TestScores scores1 = new TestScores(test1, test2, test3);
		
		System.out.println("Average of the entered scores is : " + scores1.getTestAverage());
		System.out.println("Letter grade is " + scores1.getLetterGrade());
		
		
		
		keyboard.close();
	}

}
