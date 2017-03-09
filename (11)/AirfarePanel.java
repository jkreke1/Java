import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class AirfarePanel extends JPanel {

	private JTextField airFare;
	
	/**
	 * 
	 */
	public AirfarePanel() {
		airFare = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Airfare Costs"));
		
		add(airFare);
	}

}
