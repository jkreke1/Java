import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class RegistrationPanel extends JPanel {

	private JTextField registrationFee;
	
	/**
	 * 
	 */
	public RegistrationPanel() {
		registrationFee = new JTextField();
		
		setBorder(BorderFactory.createTitledBorder("Registration Fees"));
		
		add(registrationFee);
	}

}
