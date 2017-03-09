
public class SpeedOfSound {

	private double distanceTraveled;
	
	public SpeedOfSound() {
		
	}
	
	public double getDistanceTraveled(){
		return distanceTraveled;
	}
	public void setDistanceTraveled(double DistanceTraveled){
		this.distanceTraveled = DistanceTraveled;
	}
	
	public double getSpeedInAir(){
		double numSeconds = 0;
		
		numSeconds = distanceTraveled / 1100;
		
		return numSeconds;
	}
	public double getSpeedInWater(){
		double numSeconds = 0;
		
		numSeconds = distanceTraveled / 4900;
		
		return numSeconds;
	}
	public double getSpeedInSteel(){
		double numSeconds = 0;
		
		numSeconds = distanceTraveled / 16400;
		
		return numSeconds;
	}

}
