import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class LodgingPanel extends JPanel {

	private JTextField lodgingCharges;
	
	/**
	 * 
	 */
	public LodgingPanel() {
		lodgingCharges = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Lodging Charges"));
		
		add(lodgingCharges);
	}

}
