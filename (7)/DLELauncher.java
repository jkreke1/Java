import javax.swing.JOptionPane;

/**
 * @author Joe Kreke
 *
 */
public class DLELauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] studentAnswers = new char[20];
		
		DLE exam1 = new DLE();
		
		for(int i = 0; i < studentAnswers.length; i++){
			do{
				studentAnswers[i] = JOptionPane.showInputDialog("Please enter the student's answer for question " + (i + 1) + ": ").charAt(0);
				if(studentAnswers[i] != 'A' && studentAnswers[i] != 'B' && studentAnswers[i] != 'C' && studentAnswers[i] != 'D'){
					JOptionPane.showMessageDialog(null, "Answer should be A, B, C or D.");
				}
			}while(studentAnswers[i] != 'A' && studentAnswers[i] != 'B' && studentAnswers[i] != 'C' && studentAnswers[i] != 'D');			
		}
		
		exam1.setStudentAnswers(studentAnswers);
	}

}
