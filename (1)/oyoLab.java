
public class oyoLab {
	int num1, num2;
	boolean doCalculate;
	String errorMessage = "Did not calculate.";

	public oyoLab(int x, int y, boolean n) {
		this.num1 = x;
		this.num2 = y;
		this.doCalculate = n;
		String z = this.errorMessage;
		int result = x + y;
		
		if(n == true){
			System.out.println(x + " + " + y + " = " + result);
		} else{
			System.out.println(errorMessage);
		}
	}

}
