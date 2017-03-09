
public class Car {
	//Fields
	private String yearModel;
	private String make;
	private int speed;

	//Constructor and other methods
	public Car(String YearModel, String Make) {
		this.yearModel = YearModel;
		this.make = Make;
		this.speed = 0;

	}
	
	public void Accelerate(){
		this.speed += 5;
	}
	
	public void Brake(){
		this.speed -= 5;
	}
	
	//Properties
	public String getYearModel(){
		return yearModel;
	}	
	public void setYearModel(String YearModel){
		this.yearModel = YearModel;
	}
	
	public String getMake(){
		return make;
	}
	public void setMake(String Make){
		this.yearModel = Make;
	}
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int Speed){
		this.speed = Speed;
	}

}
