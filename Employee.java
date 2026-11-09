class Employee{
	int id;
	String name;	
	double basicsalary;
	double bonus;
	double netsalary;
	
	void setEmployee(){
		id=1000;
		name="Kithi";
		basicsalary=1000000;
	}
	void calcbonus(){
		if(basicsalary>100000){
			bonus=basicsalary*0.10;
		}
		else{
			bonus=basicsalary*0.5;
		}
	}
	void Display(){
			bonus=basicsalary+bonus;
			System.out.println("bonus:"+bonus);
			System.out.println("netsalary:"+netsalary);
			System.out.println("name:"+name);
			System.out.println("id:"+id);			
	}
}