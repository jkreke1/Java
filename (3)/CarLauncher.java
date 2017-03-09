
public class CarLauncher {

	public static void main(String[] args) {
		Car car1 = new Car("2017 Lotus", "Evora");
		
		for(int i = 0; i < 5; i++){
			car1.Accelerate();
			System.out.println(car1.getSpeed());
		}
		
		for(int i = 0; i < 5; i++){
			car1.Brake();
			System.out.println(car1.getSpeed());
		}

	}

}
