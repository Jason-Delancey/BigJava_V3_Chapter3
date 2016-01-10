/**
 * 
 */

/**
 * @author CloudStrife
 * Simulates the growth of a roach population.
 */
public class RoachPopulation
{
	private double population;
	
	public RoachPopulation(double initialPopulation)
	{
		population = initialPopulation;
	}
	
	/**
	 * Simulates a period in which the roaches breed, which doubles their population. 
	 */
	public void breed()
	{
		population *= 2;
	}
	
	/**
	 * Simulates spraying with insecticide, which reduces the population by 10%.
	 */
	public void spray()
	{
		population -= (population * 0.10);
	}
	
	/**
	 * Returns the current number of roaches.
	 * @return the current number of roaches
	 */
	public double getRoaches()
	{
		return population;
	}
}
