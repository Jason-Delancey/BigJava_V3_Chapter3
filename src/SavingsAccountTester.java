/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
              Tests the savings account class.
 */
public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingsAccount momsSavings = new SavingsAccount(1000, 10);
		momsSavings.addInterest();
		momsSavings.addInterest();
		momsSavings.addInterest();
		momsSavings.addInterest();
		momsSavings.addInterest();
		System.out.println(momsSavings.getBalance());
		System.out.println("Expected balance: 1610.51");
	}
}
