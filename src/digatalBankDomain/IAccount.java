package digatalBankDomain;
public interface IAccount {

	void cash(double value);
	
 	void	transfer(double value, Account destinataryAccount);
	
	void deposit(double value);
	
	void printExtract();
	
}



