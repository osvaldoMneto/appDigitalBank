package digatalBankDomain;

public abstract class Account implements IAccount{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 0;

	protected int agency;
	protected int number;
	protected int balance;
	private Costum client;
	
    public final Costum getClient() {
		return client;
	}

	public final void setClient(Costum client) {
		this.client = client;
	}


    
	public Account(Costum client) {
		
		this.agency = AGENCIA_PADRAO;
		this.number = SEQUENCIAL++;
		this.client = client;
		
	}
	
	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void cash(double value) {
		// TODO Auto-generated method stub
		this.balance -= value;
		
	}

	@Override
	public void transfer(double value,  Account destinataryAccount) {
		// TODO Auto-generated method stub
		this.cash(value);
	    destinataryAccount.deposit(value);
		
	}

	@Override
	public void deposit(double value) {
		this.balance += (value);
		
		// TODO Auto-generated method stub
		
	}
	
	protected void printComonsInfoAcount() {
		System.out.println(String.format("Titular: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d ", this.agency));
		System.out.println(String.format("Number: %d ", this.number));
		System.out.println(String.format("Balence:%d", this.balance));
	}
}

