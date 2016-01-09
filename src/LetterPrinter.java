/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class LetterPrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Letter temp = new Letter("Jason", "Michelle");
		temp.addLine("I am sorry we must part.");
		temp.addLine("I wish you all the best.");
		System.out.println(temp.getText());
	}

}
