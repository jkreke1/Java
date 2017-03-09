import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Joe Kreke
 *
 */
public class TemperatureGUI extends JFrame {

	private calcTempPanel calcTempPanel;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	/**
	 * 
	 */
	public TemperatureGUI() {
		super("Convert Celcius to Fahrenheit");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		calcTempPanel = new calcTempPanel();
		buildPanel();
		
		add(calcTempPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public void buildPanel(){
		buttonPanel = new JPanel();
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		calcButton.addActionListener(new calcButtonListener());
		exitButton.addActionListener(new exitButtonListener());
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	
	private class calcButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			double C = calcTempPanel.getCelciusTemp();
			double F;
			
			F = (1.8 * C) + 32;
			
			JOptionPane.showMessageDialog(null, "Fahrenheit Temperature is: " + F);
		}
		
	}
	
	private class exitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TemperatureGUI();

	}

}
