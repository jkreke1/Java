
public class ShippingCharges {

	private double packageWeight;
	
	public ShippingCharges() {
		
	}
	
	public double getPackageWeight(){
		return packageWeight;
	}
	public void setPackageWeight(double PackageWeight){
		this.packageWeight = PackageWeight;
	}
	
	public double getShippingCharges(){
		double shippingCharges = 0;
		
		if(packageWeight <= 2 && packageWeight > 0){
			shippingCharges = 1.1;
		} else if(packageWeight <= 6 && packageWeight > 2){
			shippingCharges = 2.2;
		} else if(packageWeight <= 10 && packageWeight > 6){
			shippingCharges = 3.7;
		} else if(packageWeight > 10){
			shippingCharges = 4.8;
		} else if(packageWeight < 0 ){
			System.out.println("Please enter a valid weight value.");
			System.exit(0);
		}
		
		return shippingCharges;
	}

}
