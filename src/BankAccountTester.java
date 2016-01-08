/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class BankAccountTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BankAccount temp = new BankAccount();
		temp.deposit(1000);
		temp.withdraw(500);
		temp.withdraw(400);
		temp.getBalance();
		System.out.println("Expected Result: " + "100");
	}

}
