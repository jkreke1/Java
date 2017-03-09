
public class Challenge18 {

	public static void main(String[] args) {
		final int NUM_SHARES = 1000;
		double purchasePrice = 32.87 * NUM_SHARES;
		double buyCommission = .02 * purchasePrice;
		double buyTotal = buyCommission + purchasePrice;
		double sellPrice = 33.92 * NUM_SHARES;
		double sellCommission = .02 * sellPrice;
		double sellTotal = sellPrice - sellCommission;
		double profit;
		
		//display information
		System.out.printf(" Buy amount: $%.2f\n Buy commission: $%.2f\n Sold for: $%.2f\n Sell commission: $%.2f \n"
				, purchasePrice, buyCommission, sellPrice, sellCommission);
		
		System.out.printf("Joe paid $%.2f for the stock. It sold for $%.2f.\n", buyTotal, sellTotal);
		
		if(buyTotal < sellTotal){
			profit = sellTotal - buyTotal;
			System.out.printf("The profit in the exchange is $%.2f.\n", profit);
		} else{
			profit = buyTotal - sellTotal;
			System.out.printf("There was no profit. Money lost in the exchange is $%.2f\n" , profit);
		}

	}

}
