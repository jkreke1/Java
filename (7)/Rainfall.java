
/**
 * @author Joe Kreke
 *
 */
public class Rainfall {

	
	/**
	 * Default constructor
	 */
	public Rainfall() {
		
	}
	
	/**
	 * Method to return total amount of rain
	 * @return
	 */
	public static double getTotalRainFall(double[] array){
		double total = 0;
		
		for(int i = 0; i < array.length; i++){
			total += array[i];
		}
		
		return total;
	}
	
	/**
	 * Method to return average amount of rain per month
	 * @return
	 */
	public static double getAvgMonthlyRain(double[] array){
		double avg = 0;
		
		for(int i = 0; i < array.length; i++){
			avg += array[i];
		}
		avg /= array.length;
		
		return avg;
	}
	
	/**
	 * Method to return the month with the most rain
	 * @return
	 */
	public static String getMostRain(double[] array){
		int month = 0;
		String monthName = "";
		double greatest = 0.0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] > greatest){
				greatest = array[i];
				month = i;
			}
		}
		switch(month){
		case 0:
			monthName = "January";
			break;
		case 1:
			monthName = "February";
			break;
		case 2:
			monthName = "March";
			break;
		case 3:
			monthName = "April";
			break;
		case 4:
			monthName = "May";
			break;
		case 5:
			monthName = "June";
			break;
		case 6:
			monthName = "July";
			break;
		case 7:
			monthName = "August";
			break;
		case 8:
			monthName = "September";
			break;
		case 9:
			monthName = "October";
			break;
		case 10:
			monthName = "November";
			break;
		case 11:
			monthName = "December";
			break;
		}
		
		return monthName;
		
	}

	/**
	 * Method to return the month with the most rain
	 * @return
	 */
	public static String getLeastRain(double[] array){
		int month = 0;
		String monthName = "";
		double least = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] < least){
				least = array[i];
				month = i;
			}
		}
		
		switch(month){
		case 0:
			monthName = "January";
			break;
		case 1:
			monthName = "February";
			break;
		case 2:
			monthName = "March";
			break;
		case 3:
			monthName = "April";
			break;
		case 4:
			monthName = "May";
			break;
		case 5:
			monthName = "June";
			break;
		case 6:
			monthName = "July";
			break;
		case 7:
			monthName = "August";
			break;
		case 8:
			monthName = "September";
			break;
		case 9:
			monthName = "October";
			break;
		case 10:
			monthName = "November";
			break;
		case 11:
			monthName = "December";
			break;
		}
		
		return monthName;
	}

}
