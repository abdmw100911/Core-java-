package decisonStatements;
import java.util.Scanner;

public class NestedIfElse {
	public static void gmailLogin(Scanner sc) {
		System.out.println("enter email id");
		String email = "abdmw8919@gmail.com";
		String pass = "Farooque@786";
		String inputEmail = sc.nextLine();
		String inputPass;
		if(inputEmail.equals(email)) {
			System.out.println("Enter Password");
			inputPass = sc.nextLine();
			
			if(inputPass.equals(pass)){
				System.out.println("login Successful");
			}
			else {
				System.out.println("Login not Successful");
			}
		}
		else {
			System.out.println("Invalid Email");
		}
	}
	
	public static void problem(Scanner sc) {
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a+" "+b+" "+c+" are the 3 numbers");
		
		if(a>b ) {
			if(a>c) {
				System.out.println(a+" is the largest number");
			}
			else {
				System.out.println(c+" is the largets number");
			}
		}
		else{
			if(b>c) {
				System.out.println(b+" is the largest number");
			}
			else {
				System.out.println(c+" is the largets number");
			}
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//gmailLogin(sc);
		problem(sc);
	}
}
