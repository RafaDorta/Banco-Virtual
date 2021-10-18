import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente extends Usuario {

	private String gerente;
	private ArrayList<Contas> contas = new ArrayList<Contas>();

	public void setNome(String nome) {
		this.nome = nome;
	}
	
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
	
	public ArrayList<Contas> getContas() {
		return this.contas;
	}
	
	public void abrirConta(int numeroConta, String tipoConta) {
		switch(tipoConta) 
		{
		 	case "Corrente":
		 		ContaCorrente cC = new ContaCorrente();
		 		cC.setConta(numeroConta);
		 		cC.setNome(this.getNome());
				contas.add(cC);
		 		break;
		 		
		 	case "Poupança":
		 		ContaPoupanca cP = new ContaPoupanca();
		 		cP.setConta(numeroConta);
		 		cP.setNome(this.getNome());
				contas.add(cP);
		 		break;
		 		
		 	case "Especial":
		 		ContaEspecial cE = new ContaEspecial();
		 		cE.setConta(numeroConta);
		 		cE.setNome(this.getNome());
		 		cE.setLimite(0);
				contas.add(cE);
		 		break;
		}
	}
	
	public boolean aplicaDinheiro(int conta, double valor) {
		for (Contas c : contas) {
		    if(conta == c.getConta()) {
		    	c.depositar(valor);
		    	return true;
		    }
		}
		return false;
	}
	
	public boolean retiraDinheiro(int conta, double valor) {
		for (Contas c : contas) {
		    if(conta == c.getConta()) {
		    	if(c.sacar(valor))
		    		return true;
		    	return false;
		    }
		}
		return false;
	}
	
	public boolean verificaSaldo(int conta) {
		for (Contas c : contas) {
		    if(conta == c.getConta()) {
		    	JOptionPane.showMessageDialog(null, "Saldo = R$ " + c.getSaldo());
		    	return true;
		    }
		}
		return false;
	}
	
	public String verificaExtrato(int conta) {
		String extrato;
		for(Contas c : contas) {
			if(conta == c.getConta()) {
				extrato = c.extrato();
				return extrato;
			}
		}
		return "inexistente";
	}
	
	public String printContas() {
		String clienteConta="";
		
		for(Contas c : contas) {
			String pontos="";
			for(int i =0;i<22 - this.getNome().length();i++) {
				pontos += "_";
			}
			clienteConta += this.getNome() + pontos + c.getConta()+"\n";
		}
		return clienteConta;
	}
}
