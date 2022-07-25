package digatalBankDomain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Costum osvaldo = new Costum();
		osvaldo.setName("Osvaldo");
		
		Account cc = new ChekingAccount(osvaldo);
		Account pp = new SavingsAccount(osvaldo);
		
		
		
		cc.deposit(200);
		cc.printExtract();
		
		pp.deposit(350);
		pp.transfer(50, cc);
		pp.printExtract();
		
		System.out.println();
	}

}
