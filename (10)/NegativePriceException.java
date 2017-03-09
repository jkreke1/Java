
/**
 * @author Joe Kreke
 *
 */
public class NegativePriceException extends Exception {

	/**
	 * 
	 */
	public NegativePriceException() {
		super("Price per unit cannot be negative.");
	}

}
