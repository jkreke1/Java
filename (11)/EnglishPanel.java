import javax.swing.*;
import java.awt.*;

/**
 * @author Joe Kreke
 *
 */
public class EnglishPanel extends JPanel {

	private JLabel translation;
	
	/**
	 * 
	 */
	public EnglishPanel() {
		translation = new JLabel("");
		
		setBorder(BorderFactory.createTitledBorder("English"));
		
		add(translation);
	}

}
