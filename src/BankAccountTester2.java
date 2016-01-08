/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
 * Tests the bank account class with interest.
 */
public class BankAccountTester2
{
	public static void main(String[] args)
	{
		BankAccount momsSavings = new BankAccount(1000);
		momsSavings.addInterest(10);
		momsSavings.printBalance();
		System.out.println("Expected balance: " + "1100");
	} 
	
}