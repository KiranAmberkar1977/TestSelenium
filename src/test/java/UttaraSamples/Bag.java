package UttaraSamples;

public class Bag {
	private String name;
	Item[] itemArr;
	public static int count;
	
	public Bag(String name, int numItems) {
		super();
		this.name = name;
		this.itemArr = new Item[numItems];
	}

	public Item searchItem(String n) {
		Item resItem = null;
		// BL code goes here.
		return resItem;
	}
	
	public Item getItem(String n) {
		Item resItem = null;
		// BL code goes here.
		return resItem;
	}
	
	public void printItems() {
		for (Item item : itemArr) {
			System.out.println("Item of name: " + item.getName() + "has price of: " + item.getPrice());
		}
	}
	
	public Double getTotal() {
		// BL code goes here.
		double total = 0.0;
		
		for (Item item : itemArr)
			total += item.getPrice();
	
		System.out.println("Total price of all Items are : " + total);
		
		return total;
	}
	
	public Item getMinPricedItem() {
		Item resItem = null;
		// BL code goes here.
		return resItem;
	}
	
	public Item getMaxPricedItem() {
		Item resItem = null;
		// BL code goes here.
		return resItem;
	}

	public Boolean addItem(Item item) {
		// BL code goes here.
		if (count < itemArr.length) {				// Add only if the array is able to HOLD the item.
			itemArr[count++] = item;
			return true;
		}
		else {
			System.out.println("Max Items reached...");
			return false;
		}
	}
}
