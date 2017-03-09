
public class GoldTransaction {

	public static void main(String[] args) {
		//Declaring constants
		final int NUM_BARS = 567;
		final double PURCHASE_PRICE = 11562;
		final double SELLING_PRICE = 13243;
		final double BROKER_COMM_RATE = .03;
		
		//Other variables
		double goldPurchase; 
		double purchaseComm;
		double amountPaid;
		double goldSale;
		double sellingComm;
		double amountReceived;
		double profitOrLoss;
		
		//Calculating values
		goldPurchase = PURCHASE_PRICE * NUM_BARS;
		purchaseComm = goldPurchase * BROKER_COMM_RATE;
		amountPaid = goldPurchase + purchaseComm;
		
		goldSale = SELLING_PRICE * NUM_BARS;
		sellingComm = goldSale * BROKER_COMM_RATE;
		amountReceived = goldSale - sellingComm;
		
		profitOrLoss = amountReceived - amountPaid;
		
		//Displaying results
		System.out.printf("Jack paid $%,.2f for the gold.\n"
				+ "Jack paid his broker a commission of $%,.2f on the purchase.\n"
				+ "So, Jack paid a total of $%,.2f\n", goldPurchase, purchaseComm, amountPaid );
		System.out.printf("\nJack sold the gold for $%,.2f\n"
				+ "Jack paid his broker a commission of $%,.2f on the sale.\n"
				+ "So, Jack received a total of $%,.2f\n", goldSale, sellingComm, amountReceived);
		System.out.printf("\nJack's profit or loss: $%,.2f", profitOrLoss);

	}

}
