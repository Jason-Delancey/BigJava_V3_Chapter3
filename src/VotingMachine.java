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
		favParty = aParty;
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
	 */
	public int getDemocratVotes()
	{
		return democrat;
	}
	
	/**
	 * Get the tallies for the Republican Party.
	 */
	public int getRepublicanVotes()
	{
		return republican;
	}
}
