import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Joe Kreke
 *
 */
public class TranslationGUI extends JFrame {

	private LatinPanel latin;
	private EnglishPanel english;
	
	
	/**
	 * 
	 */
	public TranslationGUI() {
		super("Translate from Latin");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1, 2));
		latin = new LatinPanel();		
		
		add(latin);
		
		pack();
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TranslationGUI();

	}

}
