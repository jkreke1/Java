
public class SumOfNumbers {
	
	//Store value of user input integer
	private int userInputInt;
	
	//Constructor
	public SumOfNumbers(int userInput) {
		this.setUserInputInt(userInput);
	}
	
	//Methods to return and set the value of userInputInt field
	public int getUserInputInt(){
		return userInputInt;
	}
	public void setUserInputInt(int UserInputInt){
		this.userInputInt = UserInputInt;
	}
	
	//Method to Sum up numbers from 1 to User Input
	public int SumRangeOfNumbers(){
		//value of current sum of numbers
		int sumOfNumbers = 0;
		int addToSum = 0;
		
		//loop to increment and add to the sumOfNumbers
		for(int i = 0; i < this.getUserInputInt(); i++){
			addToSum ++;
			sumOfNumbers += addToSum;
		}
		
		return sumOfNumbers;
	}

}
