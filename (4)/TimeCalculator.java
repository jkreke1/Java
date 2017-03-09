
public class TimeCalculator {

	private double userInputSeconds;
	
	public void setUserInputSeconds(double UserInputSeconds){
		this.userInputSeconds = UserInputSeconds;
	}
	
	public double getUserInputSeconds(){
		return userInputSeconds;
	}
	
	/*public double getMinutes(){
		double minutes = 0;
		if(userInputSeconds >= 60){
			minutes = userInputSeconds/60;
		}
		return minutes;
	}*/
	
	public double getMinutesOverSixty(){
		double time = 0;
		if(userInputSeconds >= 60 && userInputSeconds < 3600){
			time = userInputSeconds/60;
		}else if(userInputSeconds >= 3600 && userInputSeconds < 86400){
				time = (userInputSeconds/60)/60;
		}else if(userInputSeconds >= 86400){
					time = ((userInputSeconds/60)/60)/24;
		} else {
			System.out.println("You have entered an invalid number.");
			System.exit(0);
		}
		return time;
	}
	
	
	public void printMinutes(){
		String outputType = "";
		
		if(userInputSeconds >= 60){
			outputType = "minutes";
			if(userInputSeconds >= 3600){
				outputType = "hours";
				if(userInputSeconds >= 86400){
					outputType = "days";
				}
			}
		}
		
		System.out.println("The number of " + outputType + " in " + userInputSeconds + " seconds is " + this.getMinutesOverSixty());
	}
	
}
