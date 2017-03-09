/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class InvalidMonthException extends Exception {

	/**
	 * 
	 */
	public InvalidMonthException() {
		super("The month number must be between 1 and 12");
	}

}
