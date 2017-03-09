import javax.swing.JOptionPane;

public class Population2 {
	private double startingNum; 			//Starting number of organisms
	private double avgDailyIncrease; 		//Average daily increase
	private double numDaysMultiplied; 		//Number of days species will multiply
	private double currentPopulation;		//Store the current population as loop iterates
	
	public Population2() {
		
	}

	/**
	 * @return the startingNum
	 */
	public double getStartingNum() {
		return startingNum;
	}

	/**
	 * @param startingNum the startingNum to set
	 */
	public void setStartingNum(double startingNum) {
		this.startingNum = startingNum;
	}

	/**
	 * @return the avgDailyIncrease
	 */
	public double getAvgDailyIncrease() {
		return avgDailyIncrease;
	}

	/**
	 * @param avgDailyIncrease the avgDailyIncrease to set
	 */
	public void setAvgDailyIncrease(double avgDailyIncrease) {
		this.avgDailyIncrease = avgDailyIncrease;
	}

	/**
	 * @return the numDaysMultiplied
	 */
	public double getNumDaysMultiplied() {
		return numDaysMultiplied;
	}

	/**
	 * Set the numDays Multiplied and initialize currentPopulation
	 * to the same number
	 * @param numDaysMultiplied the numDaysMultiplied to set
	 */
	public void setNumDaysMultiplied(double numDaysMultiplied) {
		this.numDaysMultiplied = numDaysMultiplied;	
	}

	/**
	 * Displays the size of the population for each day
	 */
	public void displayPopulationSize(){
		String myString = "";
		myString += "********Species Population********" + "\n" + 
				"Starting Population: " + this.startingNum + "\n" +
				"Average Population Increase: " + this.avgDailyIncrease + "\n" +
				"Number of days multiplied: " + this.numDaysMultiplied + "\n" +
				"Ending population: " + this.getCurrentPopulation();
		JOptionPane.showMessageDialog(null, myString);
		
	}
	
	/**
	 * Get the current population based on the starting number
	 * current population = starting number  * avg daily increase
	 */
	public double getCurrentPopulation() {
		this.currentPopulation = (((double)this.currentPopulation * (double)this.avgDailyIncrease)
				+ (double)this.currentPopulation);
		return this.currentPopulation;
	}

	/**
	 * Creates a loop to determine the population for each
	 * day by calling the getCurrentPopulation
	 */
	public void setCurrentPopulation() {
		this.currentPopulation = this.startingNum;
		for(int i = 1; i < this.numDaysMultiplied; i++);{
			this.currentPopulation = getCurrentPopulation();
			System.out.println("Loop called");
		}
	}

}
