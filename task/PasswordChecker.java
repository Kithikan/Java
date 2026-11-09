java.util.Scanner;

public class PasswordChecker{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in)
		String correctPassword = "@yarlit123";
		int attempts = 3;
		
		while (attempts > 0){
			System.out.print("Enter password; ");
			String password = sc.nextLine();
			
			if(password.equals(correctPassword)){
				System.out.println("Access Granted");
				break;
				
			} else {
				attempts--;
				System.out.println(" Wrong Password. Attempts left: " attempts);	
			}	
		}
			if(attempts == 0){
				System.out.println("Access Blocked");	
		}	
	} 
}