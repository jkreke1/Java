
public class Swim {
	Boolean waterIsWarm;

	public Swim(Boolean n) {
		this.waterIsWarm = n;
		
		if(waterIsWarm == true){
			System.out.println("The water is warm, go for a swim!");
		} else{
			System.out.println("The water is cold, get out of the pool!");
		}
	}

}
