/**
 * 
 */

/**
 * @author CloudStrife
 * A product with a name and a price.
 */
public class Product
{
	private String name;
	private double price;
	
	/**
	 * Construct a product with a given name and price
	 * @param n a given name
	 * @param p a given price
	 */
	public Product(String n, double p)
	{
		name = n;
		price = p;
	}
	
	/**
	 * Returns the name of the product
	 * @return the name of the product
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the price of the product.
	 * @return the price of the product
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Reduces the price of the product.
	 * @param amount the amount to reduce the price by
	 */
	public void reducePrice(double amount)
	{
		price -= amount;
	}
}
