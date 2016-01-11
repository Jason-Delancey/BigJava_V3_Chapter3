import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
 * Makes the dimensions for a bull's eye.
 * The outer most circle
 */
public class BullsEye extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Ellipse2D.Double outerCircle, innerCircle;
	private double radius, rectangle_x, rectangle_y, xCenter, yCenter, width, height;

	/**
      Creates a new instance of BullsEye.
      @param r the radius
      @param x the center x-coordinate
      @param y the center y-coordinate
	 */
	public BullsEye(double r, double x, double y)
	{
		radius = r;
		xCenter = x;
		yCenter = y;
		width = 2*radius;
		height = 2*radius;
		rectangle_x = xCenter - radius;
		rectangle_y = yCenter - radius;
		outerCircle = new Ellipse2D.Double(rectangle_x, rectangle_y, width, height);
	}

	/**
	 * Draws the bull's eye.
	 * @param g2 the graphics context
	 */
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.black);
		g2.draw(outerCircle);
		g2.fill(outerCircle);
		
		radius = radius - (radius * 0.20);
		rectangle_x = xCenter - radius;
		rectangle_y = yCenter - radius;
		width = 2*radius;
		height = 2*radius;
		innerCircle = new Ellipse2D.Double(rectangle_x, rectangle_y, width, height);
		g2.setColor(Color.white);
		g2.draw(innerCircle);
		g2.fill(innerCircle);
		
		radius = radius - (radius * 0.20);
		rectangle_x = xCenter - radius;
		rectangle_y = yCenter - radius;
		width = 2*radius;
		height = 2*radius;
		innerCircle = new Ellipse2D.Double(rectangle_x, rectangle_y, width, height);
		g2.setColor(Color.black);
		g2.draw(innerCircle);
		g2.fill(innerCircle);
		
		radius = radius - (radius * 0.20);
		rectangle_x = xCenter - radius;
		rectangle_y = yCenter - radius;
		width = 2*radius;
		height = 2*radius;
		innerCircle = new Ellipse2D.Double(rectangle_x, rectangle_y, width, height);
		g2.setColor(Color.white);
		g2.draw(innerCircle);
		g2.fill(innerCircle);
		
		radius = radius - (radius * 0.20);
		rectangle_x = xCenter - radius;
		rectangle_y = yCenter - radius;
		width = 2*radius;
		height = 2*radius;
		innerCircle = new Ellipse2D.Double(rectangle_x, rectangle_y, width, height);
		g2.setColor(Color.black);
		g2.draw(innerCircle);
		g2.fill(innerCircle);
	}
}

