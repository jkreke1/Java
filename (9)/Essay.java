
/**
 * @author Joe Kreke
 *
 */
public class Essay extends GradedActivity {

	double grammar,
		   spelling,
		   correctLength,
		   content;
	
	/**
	 * 
	 */
	public Essay() {
		
	}
	
	public Essay(double Grammar, double Spelling, double CorrectLength, double Content) {
		this.grammar = Grammar;
		this.spelling = Spelling;
		this.correctLength = CorrectLength;
		this.content = Content;
		this.setScore(grammar + spelling + correctLength + content);
	}
	
	/**
	 * @return the grammar
	 */
	public double getGrammar() {
		return grammar;
	}

	/**
	 * @param grammar the grammar to set
	 */
	public void setGrammar(double grammar) {
		this.grammar = grammar;
	}

	/**
	 * @return the spelling
	 */
	public double getSpelling() {
		return spelling;
	}

	/**
	 * @param spelling the spelling to set
	 */
	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}

	/**
	 * @return the correctLength
	 */
	public double getCorrectLength() {
		return correctLength;
	}

	/**
	 * @param correctLength the correctLength to set
	 */
	public void setCorrectLength(double correctLength) {
		this.correctLength = correctLength;
	}

	/**
	 * @return the content
	 */
	public double getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(double content) {
		this.content = content;
	}

	public String toString(){
		return "Essay: \n" + 
			   "Points for grammar: " + this.grammar + "\n" +
			   "Points for spelling: " + this.spelling + "\n" + 
			   "Points for correct length: " + this.correctLength + "\n" + 
			   "Points for content: " + this.content + "\n" + 
			   "Total Points: " + this.getScore();
	}

}
