import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class MilesDrivenPanel extends JPanel {

	private JTextField milesDriven;
	
	/**
	 * 
	 */
	public MilesDrivenPanel() {
		milesDriven = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Miles Driven"));
		
		add(milesDriven);
	}

}
