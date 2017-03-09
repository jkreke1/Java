import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ChallengeFive {

	public static void main(String[] args) {
		double numCookies;
		double numCalories;
		double numServings;
		DecimalFormat formatter = new DecimalFormat("###,##0");
		DecimalFormat formatter2 = new DecimalFormat("###,##0.00");
		
		numCookies = Double.parseDouble(JOptionPane.showInputDialog("How many cookies did you eat?"));
		
		if(numCookies > 4){
			JOptionPane.showMessageDialog(null, "Wow, that many?");
		}
		
		numCalories = numCookies * 75;
		numServings = numCookies / 4;
		
		JOptionPane.showMessageDialog(null, "You had " + formatter2.format(numServings) +
				                      " servings which is " + formatter.format(numCalories) + " calories." );
		
		if(numServings > 1){
			JOptionPane.showMessageDialog(null, "You had more than the recommended nunmber of servings. \n"
										  + "Maybe you should hit the gym.");
		}
	}

}
