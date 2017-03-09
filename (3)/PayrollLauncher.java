import java.util.Scanner;

public class PayrollLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int idNumber;
		double payRate;
		int hoursWorked;
		
		//Accept user input for employee information
		System.out.println("Enter the following information: ");
		System.out.print("Name >> ");
		name = keyboard.nextLine();
		System.out.print("ID Number >> ");
		idNumber = keyboard.nextInt();
		System.out.print("Pay Rate >> ");
		payRate = keyboard.nextDouble();
		System.out.print("Hours Worked >> ");
		hoursWorked = keyboard.nextInt();
		
		Payroll employee1 = new Payroll(name, idNumber, payRate, hoursWorked);
		
		System.out.printf("Amount of gross pay earned by %s is $%.2f", name, employee1.CalculateGrossPay());
		
		keyboard.close();

	}

}
