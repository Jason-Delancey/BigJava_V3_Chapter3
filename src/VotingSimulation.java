/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
               This program simulates an election.
 */
public class VotingSimulation
{
	public static void main(String[] args)
	{
		VotingMachine vm = new VotingMachine();
		vm.clear();
		vm.voteForDemocrat();
		vm.voteForRepublican();
		vm.voteForDemocrat();
		vm.voteForRepublican();
		vm.voteForRepublican();
		System.out.print("Democrats: ");
		System.out.println(vm.getDemocratVotes());
		System.out.println("Expected amount: 2");
		System.out.print("Republicans: ");
		System.out.println(vm.getRepublicanVotes());
		System.out.println("Expected amount: 3");
	} 
	
}

