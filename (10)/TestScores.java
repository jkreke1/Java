
/**
 * @author Joe Kreke
 *
 */
public class TestScores {

	private double[] testScores;
	
	/**
	 * 
	 */
	public TestScores() {
		
	}
	
	/**
	 * @throws InvalidTestScore 
	 * 
	 */
	public TestScores(double[] TestScores) throws InvalidTestScore {
		this.testScores = TestScores;
		//Check for invalid test score and throw exception
		for(int i = 0; i < this.testScores.length; i++){
			if(this.testScores[i] < 0 || this.testScores[i] > 100){
				throw new InvalidTestScore(this.testScores[i]);
			}
		}
		
		
		
	}

	/**
	 * @return the testScores
	 */
	public double[] getTestScores() {
		return testScores;
	}

	/**
	 * @param testScores the testScores to set
	 */
	public void setTestScores(double[] testScores) {
		this.testScores = testScores;
		
	}
	
	/**
	 * Determine average of test scores
	 */
	public void getAverage(double[] array){
		double average = 0;
		
		//Loop through array of test scores and find total
		for(int i = 0; i < array.length; i++){
			average += array[i];
		}
		//Find average from total
		average /= array.length;
		
		//Print results
		System.out.println("Average test score: " + average);
	}

}
