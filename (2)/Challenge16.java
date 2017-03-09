
public class Challenge16 {

	public static void main(String[] args) {
		int numSurveyed = 15000;
		double percentNRG = numSurveyed * .18;
		double percentCitrus = percentNRG * .58;
		
		//display information
		System.out.printf("Out of " + numSurveyed + " people, %.0f purchase an energy drink "
				+ "at least\nonce a week. %.0f of those people prefer citrus flavor.", percentNRG, percentCitrus);

	}

}
