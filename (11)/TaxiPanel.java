import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class TaxiPanel extends JPanel {

	private JTextField taxiCharges;
	
	/**
	 * 
	 */
	public TaxiPanel() {
		taxiCharges = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Taxi Charges"));
		
		add(taxiCharges);
	}

}
