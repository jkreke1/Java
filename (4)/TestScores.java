
public class TestScores {

	//Store values of three tests
	private double testOne;
	private double testTwo;
	private double testThree;
	//Constructor
	public TestScores(double TestOne, double TestTwo, double TestThree) {
		this.testOne = TestOne;
		this.testTwo = TestTwo;
		this.testThree = TestThree;
	}
	
	//Return and set the values of the three tests
	public double getTestOne(){
		return testOne;
	}
	
	public double getTestTwo(){
		return testTwo;
	}
	
	public double getTestThree(){
		return testThree;
	}
	
	public double getTestAverage(){
		return (testOne + testTwo + testThree)/3;
	}
	
	//Determine the average of the three test scores and assign a letter grade
	public char getLetterGrade(){
		char letterGrade = 'z';
		if(this.getTestAverage() >= 90){
			letterGrade = 'A';
		} else if(this.getTestAverage() >= 80 && this.getTestAverage() < 90){
			letterGrade = 'B';
		} else if(this.getTestAverage() >= 70 && this.getTestAverage() < 80){
			letterGrade = 'C';
		} else if(this.getTestAverage() >= 60 && this.getTestAverage() < 70){
			letterGrade = 'D';
		} else if(this.getTestAverage() < 60){
			letterGrade = 'F';
		}
		return letterGrade;
	}

}
