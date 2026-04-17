package decisonStatements;
import java.util.Scanner;
public class IfElse {
	public static void problem1(int day) {
		//wajp to print day of the week using if else
		if(day == 1) {
			System.out.println("Monday");
			
		}else if(day == 2) {
			System.out.println("Tuesday");
			
		}else if(day == 3) {
			System.out.println("Wednesday");
			
		}else if(day == 4) {
			System.out.println("Thursday");
			
		}else if(day == 5) {
			System.out.println("Friday");
			
		}else if(day == 6) {
			System.out.println("Saturday");
			
		}else if(day == 7) {
			System.out.println("Sunday");
			
		}
		else {
			System.out.println("invalid input");
		}
	}
	
	public static void problem2(int age) {
		//wajp to print age group based on their age
		//0-3 -> infant, 4-12 kid, 13 - 19 teen, 20-50 adult - 51 to 70 senior
		if(age>= 0 && age <= 3) {
			System.out.println("infant");
		}else if(age>3 && age <= 12) {
			System.out.println("kid");
		}else if(age>12 && age<=19) {
			System.out.println("teen");
		}else if(age>19 && age <= 50) {
			System.out.println("adult");
		}else {
			System.out.println("Senior");
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("ente a number from 1 to 7 to print day of week");
		int day = sc.nextInt();
		problem1(day);*/
		
		System.out.println("enter age");
		int age = sc.nextInt();
		problem2(age);
		sc.close();
	}
}
