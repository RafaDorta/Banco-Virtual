import java.util.ArrayList;

public class Cliente extends Usuario {

	private String gerente;
	private ArrayList<Contas> contas = new ArrayList<Contas>();

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	public void abrirConta() {
		//adiciona uma conta na array
	}
	
	public void aplicaDinheiro(int conta, double valor) {
		int flag=0;
		
		for (Contas c : contas) {
		    if(conta == c.getConta()) {
		    	c.depositar(valor);
		    	flag = 1;
		    }
		}
		
		if(flag==0) { 
			//msg de erro (conta n�o existe)
		}
		else {
			//msg de sucesso
		}
	}
	
	public void retiraDinheiro(int conta, double valor) {
		int flag=0;
		
		for (Contas c : contas) {
		    if(conta == c.getConta()) {
		    	c.sacar(valor);
		    	flag = 1;
		    }
		}
		
		if(flag==0) { 
			//msg de erro (conta n�o existe)
		}
		else {
			//msg de sucesso
		}
	}
	
	public void verificaSaldo(int conta) {
		int flag=0;
		
		for (Contas c : contas) {
		    if(conta == c.getConta()) {
		    	//imprimir saldo
		    	flag = 1;
		    }
		}
		
		if(flag==0) { 
			//msg de erro (conta n�o existe)
		}
		else {
			//msg de sucesso
		}
	}
	
	public void verificaExtrato(int conta) {
		//verifica extrato (apresentar todas as a��es, ou seja, todas as aplica��es e retiradas feitas)
	}
}