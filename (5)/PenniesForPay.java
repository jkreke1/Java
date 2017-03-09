import java.text.DecimalFormat;

public class PenniesForPay {

	//Field to hold value for number of days worked
	private int daysWorked;
	
	//Constructor
	public PenniesForPay(int DaysWorked) {
		this.daysWorked = DaysWorked;
	}
	
	//Getter and setter for field
	public int getDaysWorked(){
		return daysWorked;
	}
	public void setDaysWorked(int DaysWorked){
		this.daysWorked = DaysWorked;
	}
	
	//Method to calculate and print salary for each day 
	//and determine the total pay after pay period
	public void getDailySalary(){
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		int days = this.getDaysWorked();
		double penny = .01;
		double total = 0;
		for(int i = 1; i <= days; i++){
			System.out.println("Amount made on day " + i + ": " + formatter.format(penny));
			total += penny;
			penny *= 2;			
		}
		System.out.println("Total pay over " + days + " days: " + formatter.format(total));
	}

}
