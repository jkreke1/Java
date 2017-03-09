
public class AbstractDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breathe("animal");
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.breathe("dog");
		dog.speak();
		dog.blink();
		
		cat.breathe("cat");
		cat.speak();
		cat.blink();
		
		System.out.println(dog.toString());
		System.out.println(cat.toString());

	}

}
