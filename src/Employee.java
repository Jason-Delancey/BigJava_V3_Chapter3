/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class Employee
{
	private String name;
	private double salary;
	
	/**
	 * Makes an employee with a name and a salary.
	 * @param employeeName name of the employee
	 * @param currentSalary salary of the employee
	 */
	public Employee(String employeeName, double currentSalary)
	{
		name = employeeName;
		salary = currentSalary;
	}
	
	/**
	 * Returns the name of the employee
	 * @return the name of the employee
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the salary of the employee
	 * @return the salary of the employee
	 */
	public double getSalary()
	{
		return salary;
	}
	
	/**
	 * Raises the salary by a given percent.
	 * @param byPercent percent of current salary to be raised
	 */
	public void raiseSalary(double byPercent)
	{
		salary = salary + (salary * (byPercent/100.0));
	}
}
