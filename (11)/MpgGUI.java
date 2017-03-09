import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * @author Joe Kreke
 *
 */
public class MpgGUI extends JFrame {

	private InputPanel inputPanel;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	
	/**
	 * 
	 */
	public MpgGUI() {
		super("Find Miles per Gallon");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		inputPanel = new InputPanel();
		buildPanel();
		
		add(inputPanel, BorderLayout.CENTER);
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
			double mpg = 0.0;
			
			mpg = inputPanel.getMPG();
			
			JOptionPane.showMessageDialog(null, "MPG is " + mpg);
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
		new MpgGUI();

	}

}
