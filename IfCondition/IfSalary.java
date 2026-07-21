class IfSalary{
	public static void main(String args[]){
		int employeeSalary = 50000;
		double tax;
		double netSalary;
									
		System.out.println("Basic salary : " + employeeSalary);
		
		if (employeeSalary > 100000){
			tax = employeeSalary * 0.03;
		} else {
			tax = employeeSalary * 0.01;
		}
		
		netSalary = employeeSalary - tax;
		
		System.out.println("Tax 	   : " + tax);
		System.out.println("Net salary : " + netSalary);
	} 
}