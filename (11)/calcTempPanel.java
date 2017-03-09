import javax.swing.*;
import java.awt.*;

/**
 * @author ShadowRun300
 *
 */
public class calcTempPanel extends JPanel {

	private JTextField cTemp;
	
	/**
	 * 
	 */
	public calcTempPanel() {
		cTemp = new JTextField(10);
		
		setBorder(BorderFactory.createTitledBorder("Celcius Temperature"));
		
		add(cTemp);
		
	}
	
	public double getCelciusTemp() {
		double temp = 0.0;
		
		temp = Double.parseDouble(cTemp.getText());
		
		return temp;
	}

}
