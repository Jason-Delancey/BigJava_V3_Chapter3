

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
 * A student who is taking quizzes.
 */
public class Student
{
	private String name;
	private double quizScore;
	int[] quizzes;
	
	/**
	 * Constructs a student with a given name and an
	 * array for quiz scores.
	 * @param n the name
	 */
	public Student(String n)
	{
		name = n;
		quizzes = new int[10];
		for(int i = 0; i < quizzes.length; i++)
		{
			quizzes[i] = -1;
		}
	}
	
	/**
	 * Gets the name of this student.
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Adds a quiz score to the quiz array.
	 * @param score the score to add to the array of quizzes
	 */
	public void addQuiz(int score)
	{
		boolean notFound = true;
		int i = 0;
		while(notFound)
		{
			if(quizzes[i] == -1 & i < quizzes.length)
			{
				quizzes[i] = score;
				notFound = false;
			}
			else
				i++;
		}
	}
	
	/**
	 * Gets the sum of all quiz scores.
	 * @return the total score
	 */
	public double getTotalScore()
	{
		for(int element: quizzes)
		{
			if(element != -1)
				quizScore += element;
		}
		return quizScore;
	}
	
	/**
	 * Gets the average of all quiz scores.
	 * @return the average score
	 */
	public double getAverageScore()
	{
		int numOfQuizzes = 0;
		for(int element: quizzes)
		{
			if(element != -1)
				numOfQuizzes++;
		}
		
		double total = 0;
		for(int element: quizzes)
		{
			if(element != -1)
				total += element;
		}
		double average = (total / numOfQuizzes);
		return average;
	}
}
