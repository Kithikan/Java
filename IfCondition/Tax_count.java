class Tax_count{
	public static void main(String args[]){
		 int employeesalary = 50000;
		 double tax;
		 double netsalary;
		 
		 if (employeesalary > 100000){
			tax = employeesalary * 0.03;

		} else {
			 tax = employeesalary * 0.01;
		}
		
		netsalary = employeesalary - tax;
		
		System.out.println("Tax 	: " +		tax);
		System.out.println("Netsalary 	: "	+ netsalary);
				
	}
}