package digatalBankDomain;

import java.util.List;

public class Bank {
	
	private  String nome;
	private List<Account>accounts;
	
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final List<Account> getAccounts() {
		return accounts;
	}
	public final void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
