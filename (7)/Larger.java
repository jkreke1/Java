

/**
 * @author Joe Kreke
 *
 */
public class Larger {

	/**
	 * 
	 */
	public Larger() {
		
	}
	
	/**
	 * 
	 */
	public static void getGreaterValues(int[] array, int n){
		int[] greaterArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++){
			if(n < array[i]){
				greaterArray[i] = array[i];
			}
		}
		for(int i = 0; i < greaterArray.length; i++){
			if(greaterArray[i] == 0){
				continue;
			}
			System.out.println(greaterArray[i]);
		}
	}

}
