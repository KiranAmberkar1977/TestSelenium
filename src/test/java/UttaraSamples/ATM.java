package UttaraSamples;

public class ATM {
	String name;

	public ATM(String name) {
		super();
		
		if (name == null || name.trim().equals(""))
			throw new IllegalArgumentException("ATM name should not be null");
		else
			this.name = name;
	}
	
	public void withDraw(ATMCard C, Double amt) throws NEMIAEx {
		if (C == null)
			throw new NEMIAEx("Card can not be null!!");
		else if (amt < 0)
			throw new NEMIAEx("Amount can not be a negative number!!");
		else if (amt > (C.getAccount_balance() - C.account_minbalance))
			throw new NEMIAEx("Resulting account balance after debitting Rs." + amt + " would be less than the minimum allowed account balance of Rs. " + C.account_minbalance + ". Please provide a lesser amount to withdraw...");
		else
			C.account_balance -= amt;
	}
	
}
