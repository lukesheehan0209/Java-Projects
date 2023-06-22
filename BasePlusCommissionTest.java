// fig 9.7 BasePlusCommissionTest.java
// BasePlusCommissionTest is to test class BasePlusCommission
public class BasePlusCommissionTest {

	public static void main(String[] args)
	{
		// instantiate CommissionEMployee Object
		BasePlusCommission employee = new BasePlusCommission(
				"Bob", "Lewis", "333-22-4444", 5000, .04, 300);
		
		//get commission employee data
		System.out.println(
				"Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n", "First name is ", 
				employee.getFirstName());
		System.out.printf("%s %s%n", "last name is:",
				employee.getLastName());
		System.out.printf("%s %s%n", "Social Security number is:",
				employee.getsocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sals is:",
				employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is:",
				employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base Salary is",
				employee.getBaseSalary());
		
		employee.setBaseSalary(1000);
		
		System.out.printf("%n%s:%n%n%s%n",
				"Updated employee information obtained by toString",employee);
	}

}
