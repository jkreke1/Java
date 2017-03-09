import java.text.DecimalFormat;

public class FatGram {

	//Store values for number of calories and grams of fat in a food item
	private double numCalories;
	private double numFatGrams;
	
	//constructor
	public FatGram() {
		
	}

	//methods to set and return values for calories and grams of fat
	public double getNumCalories() {
		return numCalories;
	}
	public void setNumCalories(double NumCalories) {
		this.numCalories = NumCalories;
	}

	public double getNumFatGrams() {
		return numFatGrams;
	}
	public void setNumFatGrams(double NumFatGrams) {
		this.numFatGrams = NumFatGrams;
	}
	
	//method determines number of calories from fat
	public double getCaloriesFromFat(){
		double caloriesFromFat;
		
		caloriesFromFat = this.getNumFatGrams() * 9;
		
		return caloriesFromFat;
	}
	
	//determines the percentage of calories from fat
	public String getPercentCaloriesFromFat(){
		double percentCalFromFat;
		
		DecimalFormat formatter = new DecimalFormat("%0.##");
		
		String message = "";
		
		percentCalFromFat = this.getCaloriesFromFat() / this.getNumCalories();
		
		if(percentCalFromFat < .30){
			message = "Your food item is low on fat. It is " + formatter.format(percentCalFromFat) + " percent fat.";
		} else {
			message = "The percent of fat in your food item is " + formatter.format(percentCalFromFat) + ".";
		}
		
		return message;
	}

}
