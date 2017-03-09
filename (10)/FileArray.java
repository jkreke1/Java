import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class FileArray {

	/**
	 * 
	 */
	public FileArray() {
		
	}
	
	public static void writeArray(String fileName, int[] array) throws IOException{
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		//Write each item of the array to the file
		for(int i = 0; i < array.length; i++){
			outputFile.writeInt(array[i]);
		}
		
		outputFile.close();
		fstream.close();

	}
	
	public static int[] readArray(String fileName, int[] array) throws IOException{
		int number;					//Current number read from file
		boolean endOfFile = false;	//determine if file still has items to read
		int[] newArray = new int[array.length];
		
		FileInputStream fstream = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(fstream);
		
		System.out.println("Reading numbers from the file:");
		
		int i = 0;
		
		while(!endOfFile){
			/**
			 * Read data from file until the end is reached
			 */
			try{
				number = inputFile.readInt();
				newArray[i] = number;
				System.out.println(number + " ");
			}catch (EOFException e){
				endOfFile = true;
			}
			i++;
		}
		
		inputFile.close();
		fstream.close();
		System.out.println("\n Done.");
		
		return newArray;

	}

}
