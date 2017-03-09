import java.io.IOException;

/**
 * 
 */

/**
 * @author Joe Kreke
 *
 */
public class FileArrayLauncher {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String fileName = "LabFile.txt";
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array2 = new int[array.length];	// Second array to hold read data from file
		
		// Call method to write file
		FileArray.writeArray(fileName, array); 
		// Call method to read from file
		array2 = FileArray.readArray(fileName, array2);

	}

}
