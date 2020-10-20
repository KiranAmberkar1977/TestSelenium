package UttaraSamples;

public class TestATMCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ATMCard AC1 = new ATMCard("JamesBond", 1000.0);
			
			ATM a1 = new ATM("AndhraBank");
			a1.withDraw(AC1, 901.0);
			
			System.out.println("The final account balance in ATM card is: " +  AC1.getAccount_balance());
		}
		catch (NEMIAEx e){
			//e.printStackTrace();
			System.out.println("Excp message is: " + e.getMessage());
		}
	}
}
