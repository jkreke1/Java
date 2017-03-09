
/**
 * @author Joe Kreke
 *
 */
public class InvalidTestScore extends Exception {

	/**
	 * No-arg constructor
	 */
	public InvalidTestScore(double badValue) {
		super("Test scores must be positive and must not be over 100. Bad Value: " + badValue);
	}

}
