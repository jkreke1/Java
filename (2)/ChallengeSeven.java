
public class ChallengeSeven {

	public static void main(String[] args) {
		double sqFeet = 389767;
		double acre = 43560;
		double numAcres;
		
		//calculation
		numAcres = sqFeet / acre;
		
		//display information
		System.out.printf("%.0f square feet is %.2f acres.", sqFeet, numAcres);
	}

}
