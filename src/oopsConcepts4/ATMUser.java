package oopsConcepts4;
import java.util.Scanner; 
interface ATM1{
	void deposit(int amt);
	void withdraw(int amt);
	void checkBal();
}

interface ATM2{
	void deposit(int amt);
	void withdraw(int amt);
	void checkBal();
}

interface ATM3{
	void deposit(int amt);
	void withdraw(int amt);
	void checkBal();
}

class Bank implements ATM1,ATM2,ATM3{

	int userBal;
	@Override
	public void deposit(int amt) {
		if(amt>0) {
			userBal += amt;
			System.out.println(amt+" deposited Successfully");
		}
		else {
			System.out.println("Enter valid amt");
		}
	}

	@Override
	public void withdraw(int amt) {
		if(amt<=userBal) {
			userBal -= amt;
			System.out.println(amt+"withdrawn successfully");
			checkBal();
		}else {
			System.out.println("Enter valid amt");
		}
		
	}
	@Override
	public void checkBal() {
		System.out.println("Available Balance : "+userBal);
		
	}
	
}
public class ATMUser {
	public static void main(String[] args) {
		ATM1 u1 = new Bank();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.check balance");
		System.out.println("4.Exit");
		
		int choice = 0;
		while (choice != 4) {
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:{
				System.out.println("Enter amt to deposit");
				int depositamt = sc.nextInt();
				u1.deposit(depositamt);
				break;
			}
			case 2 : {
				System.out.println("Enter amt to Withdraw");
				int withdrawAmt = sc.nextInt();
				u1.withdraw(withdrawAmt);
				break;
			}
			case 3 : {
				u1.checkBal();
				break;
			}
			case 4 : {
				System.out.println("Thankyou for using the ATM");
				break;
			}
			default:{
				System.out.println("Enter a valid choice");
				break;
			}
			
			}
		}
	}
}
