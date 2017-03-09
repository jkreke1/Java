
public class RetailItemLauncher {

	public static void main(String[] args) {
		RetailItem[] items = new RetailItem[3];
		
		for(int i = 0; i < 3; i++){
			items[i] = new RetailItem();
		}
		
		items[0].setDescription("Jacket");
		items[0].setUnitsOnHand(12);
		items[0].setPrice(59.95);
		
		items[1].setDescription("Designer Jeans");
		items[1].setUnitsOnHand(40);
		items[1].setPrice(34.95);
		
		items[2].setDescription("Shirt");
		items[2].setUnitsOnHand(20);
		items[2].setPrice(24.95);

	}

}
