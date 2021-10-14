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
	
	public void abrirConta(int numeroConta, String tipoConta) {
		Contas newConta = new Contas();
		newConta.setConta(numeroConta);
		newConta.setTipo(tipoConta);
		
		contas.add(newConta);
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
		    	c.sacar(valor);
		    	return true;
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
	
	
	
	
	public void verificaExtrato(int conta) {
		for(Contas c : contas) {
			if(conta == c.getConta()) {
				c.extrato();
			}
		}
	}
	
	public String printContas() {
		String contas2="";
		
		for(Contas c : contas) {
			String pontos="";
			for(int i =0;i<22 - this.getNome().length();i++) {
			pontos += "_";
			}
			
			contas2 += this.getNome() + pontos + c.getConta()+"\r\n";
					
			
		}
		return contas2;
	}
}
