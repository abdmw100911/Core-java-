package decisonStatements;
import java.util.Scanner;
public class SwitchCaseStatement {
	public static void dayOfWeek(Scanner sc) {
		int day = sc.nextInt();
		switch(day) {
		case 1:{
			System.out.println("monday");
			break;
		}case 2:{
			System.out.println("tuesday");
			break;
		}case 3:{
			System.out.println("wednesday");
			break;
		}case 4:{
			System.out.println("thursday");
			break;
		}case 5:{
			System.out.println("friday");
			break;
		}case 6:{
			System.out.println("saturday");
			break;
		}case 7:{
			System.out.println("sunday");
			break;
		}
		default:{
			System.out.println("Invalid input");
		}
		}
	}
	
	public static void findGender(Scanner sc) {
		String Gender = sc.nextLine();
		switch(Gender) {
		case "male","M","m":{
			System.out.println("You are a Mard");
			break;
		}
		case "female","f","F":{
			System.out.println("You are a Stree");
			break;
		}
		case "other","bi","trans","gay":{
			System.out.println("You are ??");
			break;
		}
		default:{
			System.out.println("invalid input");
			break;
		}
		}
	}
	
	public static void advancedSwitchCase(Scanner sc) {
		//generally if break is not used for a case , all other cases below the true case get executed 
		//but we can write switch case statement without using break , while retaining its proper functionality
		String Gender = sc.nextLine();
		switch(Gender) {
		case "male","M","m" ->{
			System.out.println("You are a Mard");
			
		}
		case "female","f","F" ->{
			System.out.println("You are a Stree");
			
		}
		case "other","bi","trans","gay" ->{
			System.out.println("You are ??");
			
		}
		default ->{
			System.out.println("invalid input");
			
		}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//dayOfWeek(sc);
		//findGender(sc);
		advancedSwitchCase(sc);
	}
}
