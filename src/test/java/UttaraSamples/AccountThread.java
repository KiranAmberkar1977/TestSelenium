package UttaraSamples;

public class AccountThread {
	private int acc_balance;

	public AccountThread(int acc_balance) {
		super();

		validate(acc_balance);
		this.acc_balance = acc_balance;
	}

	public void validate(int acc_balance) {
		if (acc_balance < 0)
			throw new IllegalArgumentException(
					"Invalid account balance to open an account (or) Invalid amount to withdraw!!. Please try again.");
	}

	public boolean checkBalance() {
		if (acc_balance > 0)
			return true;
		else
			return false;
	}

	public void withDraw(int amount) {
		validate(amount);
		acc_balance -= amount;
	}

	public void deposit(int amount) {
		validate(amount);
		acc_balance += amount;
	}

	public int getBalance() {
		return acc_balance;
	}

	public static void main(String[] args) {

		AccountThread a1 = new AccountThread(100);
		PersonThread p1 = new PersonThread("Kiran", a1); // 2 persons point to the reference to the same Account object
															// and a RC is thus expected here.
		PersonThread p2 = new PersonThread("Chetan", a1);

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		t1.setName("KiranThread");
		t2.setName("ChetanThread");

		t2.start();
		t1.start();

	}
	
}

class PersonThread implements Runnable {
		AccountThread acc;
		String name;

		public PersonThread(String name, AccountThread acc) {
			super();
			this.acc = acc;
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println("Thread" + Thread.currentThread().getName() + "checking balance...");
			
			for (int i = 0; i < 10; i++) {
				
				synchronized (acc) {
				if (acc.checkBalance()) {
					System.out.println("Thread " + Thread.currentThread().getName() + "sleeping for half second...And count is: " + i);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("Thread " + Thread.currentThread().getName() + "Withdrawing 10 rs...");
					acc.withDraw(10);
					System.out.println("Thread " + Thread.currentThread().getName() + "Withdrew 10 rs...");

				} else
					System.out.println("Account is overdrawn!!. Current account balance is: " + acc.getBalance() + " and Thread seen this is: " + Thread.currentThread().getName());
			}			// Synchronized block allows only 1 Thread (either KiranThread OR ChetanThread) to withdraw 100rs 10 times and other Thread sees the balance as zero.
		}
	}
}
