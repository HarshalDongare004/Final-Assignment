package in.harsh.conn;

public  class BankAccount implements Bank {

	private String accNumber;
	private String accHolderName;
	private double accHolderBalance;
	

	public  BankAccount(String accNumber, String  accHolderName, double accHolderBalance) {
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.accHolderBalance = accHolderBalance;
	}
	@Override
	public String BankAccount() {
		// TODO Auto-generated method stub
		return accNumber;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return accHolderName;
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accNumber;
	}

	
	public double getBalance() {
		// TODO Auto-generated method stub
		return accHolderBalance;
	}

	
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		accHolderBalance += amount;
	}
	
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(accHolderBalance < amount) {
			System.out.println("Insufficient Balance.");
		}else {
			accHolderBalance -= amount;
		}
	}

	
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Your balance is "+ accHolderBalance);
	}
//	@Override
//	public double deposit() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public double withdraw() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
}
