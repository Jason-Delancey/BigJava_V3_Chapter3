import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author CloudStrife
 * A VotingMachine class that can be used for a simple election.
 * Extra credit if the program gives the nod to your favored party 
 * if the votes are tallied after 8 p.m. on the first Tuesday in November, 
 * but acts normally on all other dates.
 */
public class VotingMachine
{
	private int democrat, republican;
	private boolean favIsDemocratic;
	private String favParty;
	
	/**
	 * Constructs a new voting machine where votes
	 * for both parties are set to 0 by default.
	 */
	public VotingMachine()
	{
		democrat = 0;
		republican = 0;
	}
	
	/**
	 * Constructs a new voting machine where votes
	 * for both parties are set to 0 by default.
	 * @param a favorite party, either democrat or republican
	 */
	public VotingMachine(String aParty)
	{
		democrat = 0;
		republican = 0;
		
		if(favParty.toLowerCase().contains("democrat"))
			favIsDemocratic = true;
		else
			favIsDemocratic = false;
	}
	
	/**
	 * Clear the machine state.
	 */
	public void clear()
	{
		democrat = 0;
		republican = 0;
	}
	
	/**
	 * Vote for a Democrat.
	 */
	public void voteForDemocrat()
	{
		democrat++;
	}
	
	/**
	 * Vote for a Republican.
	 */
	public void voteForRepublican()
	{
		republican++;
	}
	
	/**
	 * Get the tallies for the Democratic Party.
	 * if the program gives the nod to your favored party 
	 * if the votes are tallied after 8 p.m. on the first Tuesday in November, 
	 * but acts normally on all other dates.
	 */
	public int getDemocratVotes()
	{
		GregorianCalendar cal = new GregorianCalendar();
		if(cal.get(Calendar.WEEK_OF_MONTH) == 0 & cal.get(Calendar.MONTH) == 11 &
				cal.get(Calendar.DAY_OF_WEEK) == 4 & cal.get(Calendar.AM_PM) == 1 &
				cal.get(Calendar.HOUR) == 20 & favIsDemocratic & democrat <= republican)
		{
			democrat = democrat + (republican - democrat) + 1;
			return democrat;
		}
		else if(cal.get(Calendar.WEEK_OF_MONTH) == 0 & cal.get(Calendar.MONTH) == 11 &
				cal.get(Calendar.DAY_OF_WEEK) == 4 & cal.get(Calendar.AM_PM) == 1 &
				cal.get(Calendar.HOUR) == 20 & !favIsDemocratic & republican <= democrat)
		{
			republican = republican + (democrat - republican) + 1;
			return democrat;
		}
		else
			return democrat;
		
	}
	
	/**
	 * Get the tallies for the Republican Party.
	 * if the program gives the nod to your favored party 
	 * if the votes are tallied after 8 p.m. on the first Tuesday in November, 
	 * but acts normally on all other dates.
	 */
	public int getRepublicanVotes()
	{
		GregorianCalendar cal = new GregorianCalendar();
		if(cal.get(Calendar.WEEK_OF_MONTH) == 0 & cal.get(Calendar.MONTH) == 11 &
				cal.get(Calendar.DAY_OF_WEEK) == 4 & cal.get(Calendar.AM_PM) == 1 &
				cal.get(Calendar.HOUR) == 20 & favIsDemocratic & democrat <= republican)
		{
			democrat = democrat + (republican - democrat) + 1;
			return republican;
		}
		else if(cal.get(Calendar.WEEK_OF_MONTH) == 0 & cal.get(Calendar.MONTH) == 11 &
				cal.get(Calendar.DAY_OF_WEEK) == 4 & cal.get(Calendar.AM_PM) == 1 &
				cal.get(Calendar.HOUR) == 20 & !favIsDemocratic & republican <= democrat)
		{
			republican = republican + (democrat - republican) + 1;
			return republican;
		}
		else
			return republican;
	}
}
