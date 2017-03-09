import javax.swing.*;

/**
 * @author Joe Kreke
 *
 */
public class GreetingPanel extends JPanel {

	private JLabel greeting;
	
	/**
	 * 
	 */
	public GreetingPanel() {
		greeting = new JLabel("Welcome to Mr. Lutes's House of Bagels");
		
		add(greeting);
	}

}
