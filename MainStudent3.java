import java.util.Scanner;
 class MainStudent3{ 
	public static void main(String[] args)	
	Scanner input = new Scanner(System.in); 
	System.out.print("Enter Id : "); 
	int id = input.nextInt(); 
	input.nextLine(); 
	System.out.print("Enter Name : "); 
	String name = input.nextLine(); 
	System.out.print("Enter number of subjects : "); 
	int n = input.nextInt(); 
	int marks[] = new int[n];
	for (int i = 0; i < n; i++){ System.out.print("Enter mark for Subject " + (i+1) + " : "); marks[i] = input.nextInt(); } Student3 s1 = new Student3(); s1.setStudent(id, name, marks); s1.displayDetails(); input.close(); } }