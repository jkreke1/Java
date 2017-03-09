import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class DaysOnTrip extends JPanel {

	private JTextField daysOnTrip;
	
	/**
	 * 
	 */
	public DaysOnTrip() {
		daysOnTrip = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Days on Trip"));
		
		add(daysOnTrip);
		
	}

}
