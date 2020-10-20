package UttaraSamples;

public class TestBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item[] itemArray = new Item[5];
		itemArray[0] = new Item("Duster", 20.0);
		itemArray[1] = new Item("Pencil", 10.0);
		itemArray[2] = new Item("Stapler", 75.5);
		itemArray[3] = new Item("Sharpener", 15.5);
		itemArray[4] = new Item("Stencil", 25.5);
		
		Bag b1 = new Bag("VIP", 5);
		
		int i = 0;
		
		while (i < itemArray.length) {
			System.out.println("Adding item of index :" + i + "into bag now...");
			b1.addItem(itemArray[i++]);
		}
		
		b1.printItems();
		b1.getTotal();
	}
}
