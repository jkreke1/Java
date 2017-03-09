import java.util.Scanner;

public class TemperatureLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double userTemperature;
		
		//Accept user input for Fahrenheit temperature
		System.out.print("Enter a temperature in Fahrenheit >> ");
		
		userTemperature = keyboard.nextDouble();
		
		Temperature temp1 = new Temperature(userTemperature);
		
		//Calculate and display temperature conversions
		System.out.println(userTemperature + " in Celsius:");
		System.out.printf("%.2f degrees\n",temp1.getCelsius());
		System.out.println(userTemperature + " in Kelvin:");
		System.out.printf("%.2f degrees\n",temp1.getKelvin());
		
		keyboard.close();

	}

}
