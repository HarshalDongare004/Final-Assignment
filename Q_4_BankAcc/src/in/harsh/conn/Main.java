package in.harsh.conn;
import java.util.Scanner;
public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the account number ::");
		String accountNumber = scan.next();
		
		System.out.print("Enter the account holder name ::");
		String name = scan.next();
		
		System.out.print("Enter the initial balance ::");
		double balance = scan.nextDouble();
		
		
		BankAccount bankAcc = new BankAccount(accountNumber, name, balance);

		while(true) {
			System.out.println("What would you like to do ?");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter the amount you want to deposit ::");
				double amount = scan.nextDouble();
				bankAcc.deposit(amount);
				break;
				
			case 2:
				System.out.print("Enter the amount you want to withdraw ::");
				double amt = scan.nextDouble();
				bankAcc.withdraw(amt);
				break;
			
			case 3:
				bankAcc.checkBalance();
				break;
				
			case 4 :
				System.out.println("Thank you for using appliction...");
				System.exit(0);
				
				break;
			default:
				System.out.print("Invalid Choice");
			}
		}
	
	}

	
}
