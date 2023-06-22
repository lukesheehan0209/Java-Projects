// fig 9.5 CommissionEmployeeTest.java
//CommissionEmployee class test program

public class CommissionEmployeeTest {

	public static void main(String[] args) 
	{
		// instantiate CommissionEMployee Object
		CommissionEmployee employee = new CommissionEmployee(
				"jack", "jones", "222-33-4444", 15000, 0.6);
		
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
		
		employee.setGrossSales(15000);
		employee.setCommissionRate(.05);
		
		System.out.printf("%n%s:%n%n%s%n",
				"Updated employee information obtained by toString",employee);
	}

}
