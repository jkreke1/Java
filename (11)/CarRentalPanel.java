import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class CarRentalPanel extends JPanel {

	private JTextField carRental;
	
	/**
	 * 
	 */
	public CarRentalPanel() {
		carRental = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Car Rental Cost"));
		
		add(carRental);
	}

}
