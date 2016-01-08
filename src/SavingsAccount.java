/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class SavingsAccount extends BankAccount
{
	private double interest;
	private double balance;
	
	/**
	 *  Default constructor the makes a bank account, savings account without an interest rate
	 */
	public SavingsAccount()
	{
		super();
	}
	
	/**
	 * New savings account with an initial balance and an interest rate.
	 * @param initialBalance starting balance of the savings account
	 * @param rate interest rate on the savings account
	 */
	public SavingsAccount(double initialBalance, double rate)
	{
		balance = initialBalance;
		interest = rate/100.0;
	}
	
	/**
	 * Adds interest to the balance.
	 */
	public void addInterest()
	{
		balance = balance + (balance * interest);
	}
	
	/**
	 * Gets the balance of the savings account.
	 */
	public double getBalance()
	{
		return balance;
	}
}
