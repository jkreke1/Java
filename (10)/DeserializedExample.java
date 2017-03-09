import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * This class is for fruit objects
 * that will hold values for type of
 * fruit, color, qty, etc
 */

/**
 * @author Joe Kreke
 *
 */
public class DeserializedExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit[] fruitArray = new Fruit[3];
		
		try{
			FileInputStream inputStream = new FileInputStream("Fruit.txt");
			ObjectInputStream inputObject = new ObjectInputStream(inputStream);
			for(int i = 0; i < fruitArray.length; i++){
				fruitArray[i] = (Fruit)inputObject.readObject();
			}
			
			for(Fruit fruit: fruitArray)
				System.out.println("***New Fruit Item***\n" + 
								   "Fruit Type: " + fruit.getFruitType() + "\n" + 
								   "Color: " + fruit.getColor() + "\n" + 
								   "Quantity: " + fruit.getQty() + "\n" + 
								   "Rating: " + fruit.getRating() + " out of five stars!\n");
			inputObject.close();
			inputStream.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Your program " + 
							   "encountered an error");
		}

	}

}
