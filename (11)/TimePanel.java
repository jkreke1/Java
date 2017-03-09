import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class TimePanel extends JPanel {

	private JTextField time;
	
	/**
	 * 
	 */
	public TimePanel() {
		time = new JTextField(10);
		
		setBorder(BorderFactory.createTitledBorder("Length of Call"));
		
		add(time);
	}
	
	public double getLength() {
		double length = 0.0;
		
		length = Double.parseDouble(time.getText());
		
		return length;
	}

}
