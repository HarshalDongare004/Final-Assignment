package in.harsh.conn;

import java.util.Scanner;

public class UDException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an  integer :");
		int num = scan.nextInt();
		try {
			if (num < 0) {
				throw new NegativeNumberException("The number is negative ");
			} else {
				System.out.println("The number is positive");
			}
		} catch (NegativeNumberException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
