/**
 * 
 */

/**
 * Creates a bank account.
 * @author CloudStrife
 *
 */
public class BankAccount
{
	private double balance;
	
	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * Constructs a bank account with a given initial balance.
	 * @param initialBalance starting balance for the bank account
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	 * Adds a given amount to the bank account balance.
	 * @param amount amount added to the bank account
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/**
	 * Deducts a given amount from the bank account balance.
	 * @param amount amount withdrawn from the bank account
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	/**
	 * Prints out the current bank account balance to the console.
	 */
	public void printBalance()
	{
		System.out.println("The current bank account balance is: " + balance);
	}
	
	/**
	 * Returns the current bank account balance to the console.
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Adds interest rate earned to the bank account balance.
	 * @param rate interest earned on the bank account balance
	 */
	public void addInterest(double rate)
	{
		balance = balance + (balance * (rate/100.0));
	}
	
	public void changeBalance(double newBalance)
	{
		balance = newBalance;
	}

}
