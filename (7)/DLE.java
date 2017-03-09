
/**
 * @author Joe Kreke
 *
 */
public class DLE {

	private static char[] answerKey = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
									   'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};	
	private char[] studentAnswers = new char[20];
	
	/**
	 * 
	 */
	public DLE() {
		
	}
	
	/**
	 * Determine if student passed the exam
	 * @return
	 */
	public boolean passed(){
		boolean passed = false;
		
		if(this.totalCorrect() >= 15){
			passed = true;
		}
		
		return passed;
	}
	
	/**
	 * Determine the total number of questions
	 * answered correctly
	 * @return
	 */
	public int totalCorrect(){
		int total = 0;
		
		for(int i = 0; i < answerKey.length; i++){
			if(answerKey[i] == getStudentAnswers()[i]){
				total++;
			}
		}
		
		return total;
	}
	
	/**
	 * Determine the total number of questions
	 * answered incorrectly
	 */
	public int totalIncorrect(){
		int total = 0;
		
		for(int i = 0; i < answerKey.length; i++){
			if(answerKey[i] != getStudentAnswers()[i]){
				total++;
			}
		}
		
		return total;
	}

	/**
	 * Determine the question numbers of the answers missed
	 */
	public int[] getQuestionsMissed(){
		int[] questionsMissed = new int[answerKey.length];
		
		for(int i = 0; i < answerKey.length; i++){
			if(answerKey[i] != getStudentAnswers()[i]){
				questionsMissed[i] = i + 1;
			}
		}
		return questionsMissed;
	}
	
	/**
	 * @return the studentAnswers
	 */
	public char[] getStudentAnswers() {
		return studentAnswers;
	}

	/**
	 * @param studentAnswers the studentAnswers to set
	 */
	public void setStudentAnswers(char[] StudentAnswers) {
		studentAnswers = StudentAnswers;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String str;
		
		str = "Student Passed: " + this.passed() + "\n" + 
			  "Number of Questions Correct: " + this.totalCorrect() + "\n" + 
			  "Number of Questions Incorrect: " + this.totalIncorrect() + "\n" + 
			  "Questions Missed: ";
		
		return str;
	}

}
