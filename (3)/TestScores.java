
public class TestScores {

	//Fields
	private double test1;
	private double test2;
	private double test3;
	
	//Constructors and other methods
	public TestScores() {
		
	}
	
	public double calculateAverage(){
		return (test1 + test2 + test3) / 3;
	}
	
	//Properties
	public double getTest1() {
		return test1;
	}

	public void setTest1(double test1) {
		this.test1 = test1;
	}

	public double getTest2() {
		return test2;
	}

	public void setTest2(double test2) {
		this.test2 = test2;
	}

	public double getTest3() {
		return test3;
	}

	public void setTest3(double test3) {
		this.test3 = test3;
	}


}
