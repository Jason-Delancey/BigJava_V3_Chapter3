/**
 * 
 */

/**
 * @author CloudStrife
 * A class Bug that models a bug moving along a horizontal line. 
 * The bug moves either to the right or left. Initially, the bug 
 * moves to the right, but it can turn to change its direction. 
 * In each move, its position changes by one unit in the current direction.
 */
public class Bug
{
	/** Variables to hold the direction of the bug and the position */
	boolean faceRight;
	int position;
	
	/**
	 * Constructs a Bug, given the Bug's initial position.
	 * @param initialPosition the initial position of the Bug
	 */
	public Bug(int initialPosition)
	{
		faceRight = true;
		position = initialPosition;
	}
	
	/**
	 * Changes the direction of the Bug
	 */
	public void turn()
	{
		if(faceRight)
			faceRight = false;
		else
			faceRight = true;
	}
	
	/**
	 * Moves the Bug by one unit in the current direction.
	 */
	public void move()
	{
		if(faceRight)
			position++;
		else
			position--;
	}
	
	/**
	 * Returns the Bug's current position.
	 * @return Bug's current position
	 */
	public int getPosition()
	{
		return position;
	}
}
