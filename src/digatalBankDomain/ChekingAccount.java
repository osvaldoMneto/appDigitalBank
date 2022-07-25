package digatalBankDomain;
public class ChekingAccount extends Account {

	public ChekingAccount(Costum client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printExtract() {
		System.out.println("******EXTRACT CHEKING-ACCOUNT****");
		super.printComonsInfoAcount();
	}


	


}