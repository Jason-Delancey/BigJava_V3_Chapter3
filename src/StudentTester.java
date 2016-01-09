/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
              This program tests the Student class.
 */
public class StudentTester
{
	public static void main(String[] args)
	{
		Student student = new Student("Cracker, Carla");
		// TODO: Add some quizzes
		student.addQuiz(75);
		student.addQuiz(82);
		student.addQuiz(51);
		student.addQuiz(97);
		// TODO: Print actual and expected name, total score
		System.out.println(student.getName());
		System.out.println("Expected name: Cracker, Carla");
		
		System.out.println(student.getTotalScore());
		System.out.println("Expected total score: 305");
		
		System.out.println(student.getAverageScore());
		System.out.println("Expected average score: 76.25");
	}
}
