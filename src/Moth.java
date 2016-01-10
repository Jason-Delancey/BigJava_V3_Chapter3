/**
 * 
 */

/**
 * @author CloudStrife
 * A moth flying across a straight line. 
 * The moth has a position, the distance from a fixed origin. 
 * When the moth moves toward a point of light, its new position 
 * is halfway between its old position and the position of the light source.
 */
public class Moth
{
	private double position;
	
	/**
	 * Constructs a Moth with a given initial position.
	 * @param initialPosition the initial position of the Moth
	 */
	public Moth(double initialPosition)
	{
		position = initialPosition;
	}
	
	/**
	 * When the moth moves toward a point of light, its new position 
	 * is halfway between its old position and the position of the light source.
	 * @param lightPosition the position of the light source
	 */
	public void moveToLight(double lightPosition)
	{
		position = position + (lightPosition - position)/2;
	}
	
	/**
	 * The current position of the Moth prints to the console.
	 */
	public double getPosition()
	{
		return position;
	}

}
