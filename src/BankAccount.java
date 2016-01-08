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
	 * @param initialBalance
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	 * Adds a given amount to the bank account balance.
	 * @param amount
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/**
	 * Deducts a given amount from the bank account balance.
	 * @param amount
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void getBalance()
	{
		System.out.println("The current bank account balance is: " + balance);
	}

}
