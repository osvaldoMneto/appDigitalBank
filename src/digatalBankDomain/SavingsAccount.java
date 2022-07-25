package digatalBankDomain;

public class SavingsAccount extends Account {
	
	public SavingsAccount(Costum client) {
		super(client);
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public void printExtract() {
		System.out.println("******EXTRACT Savings-ACCOUNT****");
		super.printComonsInfoAcount();
		
	}

}
