import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class ParkingPanel extends JPanel {

	private JTextField parkingFee;
	
	/**
	 * 
	 */
	public ParkingPanel() {
		parkingFee = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Parking Fees"));
		
		add(parkingFee);
	}

}
