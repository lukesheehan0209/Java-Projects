// Fig 8.13 Employee.Test.java
// static member demonstration

public class EmployeeTest {

	public static void main(String[] args) 
	{
		// show that count is 0 before creating employees
		System.out.printf("Employees before instantiation: %d%n",
				Employee.getCount());
		
		//create two Employees: count should be 2
		Employee e1 = new Employee("Susan", "Jobs");
		Employee e2 = new Employee("Steve", "Jobs");
		
		// show that count is 2 aftr creating 2 new employees
		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n" , e2.getCount());
		System.out.printf("via Employee,getCount(): %d%n",
				Employee.getCount());
		
		// get names of Employees
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());

	}

}
