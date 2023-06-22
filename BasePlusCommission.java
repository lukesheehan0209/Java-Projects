// BasePlusCommission.java
// this represents a class of where an employee
// receives commission and base pay
public class BasePlusCommission 
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; // weekly gross sales division by no of weeks
	private double commissionRate; // commission percentage
	private double baseSalary;
	
	public BasePlusCommission(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary)
	{
		// implicit call to objects default constructor occurs here
		
		// if grossSales is invalid through exception
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0");
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		
		if(baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base Salary must be >= 0.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary =baseSalary;
	}
		
		// return firstName
		public String getFirstName()
		{
			return firstName;
		}
		
		// return lastName
		public String getLastName()
		{
			return lastName;
		}
		
		// return socialSecurityNumber
		public String getsocialSecurityNumber()
		{
			return socialSecurityNumber;
		}
		
		// set grossSales amount
		public void setGrossSales(double grossSales)
		{
			if(grossSales < 0.0)
				throw new IllegalArgumentException(
						"Gross Sales must be >= 0.0");
			this.grossSales = grossSales;
		}
		
		// return gross sales mount
		public double getGrossSales()
		{
			return grossSales;
		}
		
		// set commissionRate
		public void setCommissionRate(double commissionRate)
		{
			if(commissionRate <= 0.0 || commissionRate >= 1.0)
				throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
			
			this.commissionRate = commissionRate;
		}
		
		//return commissionRate
		public double getCommissionRate()
		{
			return commissionRate;
		}
		
		public void setBaseSalary(double baseSalary)
		{
			if(baseSalary < 0.0)
				throw new IllegalArgumentException(""
						+ "Base Salary must be > 0.0");
			
			this.baseSalary = baseSalary;
		}
		
		public double getBaseSalary()
		{
			return baseSalary;
		}
		
		//calculate earnings
		public double earnings()
		{
			return baseSalary + (commissionRate * grossSales);
		}
		
		// return String representation of CommissionEmployee object
		@Override // indicates that this method overrides a superclass method
		public String toString()
		{
			return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","base-salaried commission employee"
		, firstName, lastName,
					"social security Number", socialSecurityNumber,
					"gross sales", grossSales,
					"commission rate", commissionRate,
					"Base Salary", baseSalary);
		
			} // end of constructor 
	

}
