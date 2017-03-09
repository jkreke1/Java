import java.util.Scanner;

public class TestScoresLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		TestScores group1 = new TestScores();
		
		System.out.println("Enter 3 test scores: ");
		group1.setTest1(keyboard.nextDouble());
		group1.setTest2(keyboard.nextDouble());
		group1.setTest3(keyboard.nextDouble());
		
		System.out.printf("Average test score is %.2f", group1.calculateAverage());
		
		keyboard.close();

	}

}
