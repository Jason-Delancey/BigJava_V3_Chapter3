/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
   This program simulates the growth of a roach population.
 */
public class RoachSimulation
{
	public static void main(String[] args)
	{
		RoachPopulation population = new RoachPopulation(10);
		population.breed();
		population.spray();
		System.out.print(population.getRoaches());
		System.out.println(" roaches");
		System.out.println("Expected amount: 18");
		population.breed();
		population.spray();
		System.out.print(population.getRoaches());
		System.out.println(" roaches");
		System.out.println("Expected amount: 32.4");
		population.breed();
		population.spray();
		System.out.print(population.getRoaches());
		System.out.println(" roaches");
		System.out.println("Expected amount: 58.32");
		population.breed();
		population.spray();
		System.out.print(population.getRoaches());
		System.out.println(" roaches");
		System.out.println("Expected amount: 104.976");
	} 
	
}

