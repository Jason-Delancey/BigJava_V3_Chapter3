/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class Letter
{
	private String sender, recipient, intro, body, end;
	
	public Letter(String from, String to)
	{
		sender = from;
		recipient = to;
		intro = "Dear " + recipient + ":\n\n";
		body = "";
		end = "\n\n" + "Sincerely, " + "\n\n" + sender;
	}
	
	public void addLine(String line)
	{
		body = body + line + "\n";
	}
	
	public String getText()
	{
		return intro + body + end;
	}
}
