
/**
 * @author ShadowRun300
 *
 */
public class TestScoresLauncher {

	/**
	 * @param args
	 * @throws InvalidTestScore 
	 */
	public static void main(String[] args) throws InvalidTestScore {
		double[] scores = {100, -95, 97, 89, 92};
		//Instantiate object with array of test scores
		TestScores object = new TestScores(scores);
		//Call method to get average
		object.getAverage(object.getTestScores());

	}

}
