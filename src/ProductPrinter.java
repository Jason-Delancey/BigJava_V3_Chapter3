/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class ProductPrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Product stuff = new Product("xbox", 250);
		Product things = new Product("ps3", 400);
		
		System.out.println(stuff.getName());
		System.out.println("Expected name: xbox");
		
		System.out.println(stuff.getPrice());
		System.out.println("Expected price: 250");
		
		System.out.println(things.getName());
		System.out.println("Expected name: ps3");
		
		System.out.println(things.getPrice());
		System.out.println("Expected price: 400");
		
		stuff.reducePrice(5.00);
		things.reducePrice(5.00);
		
		System.out.println(stuff.getPrice());
		System.out.println("Expected price: 245");
		
		System.out.println(things.getPrice());
		System.out.println("Expected price: 395");
	}

}
