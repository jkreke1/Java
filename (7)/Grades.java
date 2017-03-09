
/**
 * @author Joe Kreke
 *
 */
public class Grades {

	/**
	 * 
	 */
	public Grades() {
		
	}
	
	/**
	 * Determine average grade after dropping lowest
	 */
	public static double getAverage(double[] list){
		double avg = 0.0;
		
		for(int i = 0; i < list.length; i++){
			avg += list[i];
		}
		
		avg /= list.length;
		
		return avg;
	}
	
	/**
	 * Get letter grade depending on average grade
	 */
	public static char getLetterGrade(double[] list){
		char grade = 'A';
		double average = getAverage(list);
		
		if(average <= 100 && average >= 90){
			grade = 'A';
		} else if(average <= 89 && average >= 80){
			grade = 'B';
		} else if(average <= 79 && average >= 70){
			grade = 'C';
		} else if(average <= 69 && average >= 60){
			grade = 'D';
		} else if(average <= 59){
			grade = 'F';
		}
		
		return grade;
	}

}
