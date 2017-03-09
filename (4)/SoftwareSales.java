
public class SoftwareSales {

	private double numUnitsSold;
	
	public SoftwareSales() {
		
	}
	
	public double getNumUnitsSold(){
		return numUnitsSold;
	}
	public void setNumUnitsSold(int NumUnitsSold){
		this.numUnitsSold = NumUnitsSold;
	}
	
	public double getTotalPrice(){
		double unitPrice = 99;
		double total = unitPrice * numUnitsSold;
		double discount = 0;
		
		if(numUnitsSold >= 10 && numUnitsSold < 20){
			discount = total * .20;
		} else if(numUnitsSold >= 20 && numUnitsSold < 50){
			discount = total * .30;
		} else if(numUnitsSold >= 50 && numUnitsSold < 100){
			discount = total * .40;
		} else if(numUnitsSold >= 100){
			discount = total * .50;
		}
		
		return total - discount;
	}

}
