
public class InventoryItemLauncher {

	public static void main(String[] args) {
		InventoryItem item1 = new InventoryItem();
		item1.setDescription("Description 1");
		
		InventoryItem item2 = new InventoryItem(item1);
		
		System.out.println(item1.getDescription());
		System.out.println(item2.getDescription());

	}

}
