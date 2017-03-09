import java.util.Scanner;

public class WidgetOrderLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double daysToMake;
		
		WidgetOrder order1 = new WidgetOrder();
		
		//Accept user input for widgets
		System.out.print("Enter the number of widgets ordered >> ");
		order1.setNumWidgets(keyboard.nextDouble());
		
		//Calculate and print number of days needed to complete order
		daysToMake = order1.calculateDaysToMake();
		System.out.printf("It will take %.0f days to complete the order.", daysToMake);
		
		keyboard.close();

	}

}
