
public class WidgetOrder {

	//Fields
	private double numWidgets;
	private final double widgetsPerDay = 160;
	
	//Constructor and other methods
	public WidgetOrder() {
		
	}
	
	public double calculateDaysToMake(){
		return Math.ceil(numWidgets / widgetsPerDay);
	}
	
	//Properties
	public double getNumWidgets(){
		return numWidgets;
	}
	
	public void setNumWidgets(double NumWidgets){
		numWidgets = NumWidgets;
	}

}
