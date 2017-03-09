import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Joe Kreke
 *
 */
public class LatinPanel extends JPanel {

	private JButton sinister;
	private JButton dexter;
	private JButton medium;
	private JLabel translation;
	
	/**
	 * 
	 */
	public LatinPanel() {
		setLayout(new GridLayout(4, 1));
		sinister = new JButton("Sinister");
		dexter = new JButton("Dexter");
		medium = new JButton("Medium");
		translation = new JLabel();
		
		sinister.addActionListener(new sinButtonListener());
		dexter.addActionListener(new dexButtonListener());
		medium.addActionListener(new medButtonListener());
		
		
		setBorder(BorderFactory.createTitledBorder("Latin"));
		
		add(sinister);
		add(dexter);
		add(medium);
		add(translation);
		
	}
	
	private class sinButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			translation.setText("Left");
		}
	}
	
	private class dexButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			translation.setText("Right");
		}
	}
	
	private class medButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			translation.setText("Center");
		}
	}
	
}
