
public class Dog extends Animal {

	public Dog() {
		super("dog");
	}
	
	public void speak(){
		System.out.println("Bark!!");
	}
	
	public void eat(){
		System.out.println("Eating food...");
	}
	
	public String toString(){
		return "Dogs are awesome!";
	}

}
