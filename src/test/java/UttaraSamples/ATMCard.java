package UttaraSamples;

public class ATMCard {
	String account_owner;
	Double account_balance;
	Double account_minbalance;
	
	public ATMCard(String account_owner, Double account_balance) {
		super();
		this.account_owner = account_owner;
		this.account_balance = account_balance;
		this.account_minbalance = 100.0;
	}
	
	public String getAccount_owner() {
		return account_owner;
	}
	public void setAccount_owner(String account_owner) {
		this.account_owner = account_owner;
	}
	public Double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(Double account_balance) {
		this.account_balance = account_balance;
	}
	
	
}
