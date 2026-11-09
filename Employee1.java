class Employee1{
	int id;
	String name;	
	double basicsalary;
	
	
	void SetEmployee(int id,String name,double basicsalary){
		this.id=id;
		this.name=name;
		this.basicsalary=basicsalary;
	}
	double calcbonus(){
		double bonus=0.0;                          
		if(this.basicsalary>100000){
			bonus=this.basicsalary*0.10;
		}
		else{
			bonus=this.basicsalary*0.5;
		}
		return bonus;
	}
	void display(){
			System.out.println("id:"+this.id);
			System.out.println("name:"+this.name);
			System.out.println("basicsalary:"+this.basicsalary); 
			double b=this.calcbonus();
			System.out.println("bonus"+b);
			System.out.println("NetSalary"+(b+this.basicsalary));
	}
}