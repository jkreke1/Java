import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class SerializeExample implements Serializable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit[] fruitArray = new Fruit[3];
		
		fruitArray[0] = new Fruit("Strawberry", 12, "Red", 5);
		fruitArray[1] = new Fruit("Banana", 3, "Yellow", 3);
		fruitArray[2] = new Fruit("Grape", 30, "Green", 5);
		
		try{
			
			FileOutputStream outputStream = new FileOutputStream("Fruit.txt");
			ObjectOutputStream outputObject = new ObjectOutputStream(outputStream);
			for(int i = 0; i < fruitArray.length; i++){
				outputObject.writeObject(fruitArray[i]);
			}
			
			outputObject.close();
			outputStream.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("The program encountered an error");
		}

	}

}
