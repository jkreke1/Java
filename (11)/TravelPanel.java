import javax.swing.*;

/**
 * @author Joe Kreke
 *
 */
public class TravelPanel extends JPanel {

	private JLabel travel;
	
	/**
	 * 
	 */
	public TravelPanel() {
		travel = new JLabel("Determine Travel Expenses");
		
		add(travel);
	}

}
