import javax.swing.JOptionPane;

public class PopulatonLauncher {

	public static void main(String[] args) {
		double userInputDouble; //Store user input as a double
		
		//Instantiate a Population object
		Population pop = new Population();
		
		//Get the starting population from the user and set the population
		do{
			userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the starting size of the population?"));
			if(userInputDouble < 2){
				JOptionPane.showMessageDialog(null, "Please input a number 2 or greater.");
			}
		} while(userInputDouble < 2);
		pop.setStartingNum(userInputDouble);
		
		//Get the average daily increase from the user and set the daily increase
		do{
			userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the average daily increase of the population?"));
			if(userInputDouble < 0){
				JOptionPane.showMessageDialog(null, "Please enter a positive number.");
			}
		}while(userInputDouble < 0);
		pop.setAvgDailyIncrease(userInputDouble);
		
		//Get the number of days the organism will multiply from the user and set the number of days
		do{
			userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the number of days the organism will multiply?"));
			if(userInputDouble < 1){
				JOptionPane.showMessageDialog(null, "Please input a number greater than 0.");
			}
		}while(userInputDouble < 1);
		pop.setNumDaysMultiplied(userInputDouble);
		
		pop.setCurrentPopulation();
		pop.displayPopulationSize();
		
		System.exit(0);

	}

}
