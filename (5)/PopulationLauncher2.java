import javax.swing.JOptionPane;

public class PopulationLauncher2 {

	public static void main(String[] args) {
		double userInputDouble; //Store user input as a double
		
		//Instantiate a Population object
		Population pop = new Population();
		
		//Get the starting population from the user and set the population
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the starting size of the population?"));
		pop.setStartingNum(userInputDouble);
		
		//Get the average daily increase from the user and set the daily increase
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the average daily increase of the population?"));
		pop.setAvgDailyIncrease(userInputDouble);
		
		//Get the number of days the organism will multiply from the user and set the number of days
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the number of days the organism will multiply?"));
		pop.setNumDaysMultiplied(userInputDouble);
		
		pop.setCurrentPopulation();
		pop.displayPopulationSize();
		
		System.exit(0);

	}

}
