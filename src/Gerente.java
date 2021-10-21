import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gerente extends Usuario{
	
	private ArrayList<Cliente> meusClientes = new ArrayList<Cliente>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public boolean criaUsuario(String login, String senha, String nome, int flag, ArrayList<Cliente> clientes, ArrayList<Gerente> gerentes) {
		if(flag==1) { //criar cliente
			for(Cliente c : clientes) {
				if(login.equals(c.getLogin())) {
					return false;
				}
			}
			
			Cliente newCliente = new Cliente();
			newCliente.setLogin(login);
			newCliente.setSenha(senha);
			newCliente.setNome(nome);
			newCliente.setGerente(this.getNome());
			clientes.add(newCliente);
			this.meusClientes.add(newCliente);
			
		} else { //criar gerente
			for(Gerente g : gerentes) {
				if(login.equals(g.getLogin())) {
					return false;
				}
			}
			
			Gerente newGerente = new Gerente();
			newGerente.setLogin(login);
			newGerente.setSenha(senha);
			newGerente.setNome(nome);
			gerentes.add(newGerente);
		}
		return true;
	}
	
	public String verificaNomeCliente() {
		String Nomes = "";
		for(Cliente c : this.meusClientes) {
			Nomes += c.printContas();
		}
		return Nomes;
	}
	
	public boolean verificaConta(int conta) {
		for(Cliente cli : this.meusClientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String verificaInfosConta(int conta) {
		for(Cliente cli : this.meusClientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					return con.infosConta();
				}
			}
		}
		return "inexistente";
	}
	
	public boolean alteraDados(double valor,int conta, int flag) {
		for(Cliente cli : this.meusClientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					if(flag == 0) {
						if(! con.getTipo().equals("Especial")) {
							JOptionPane.showMessageDialog(null, "Esta conta não é do tipo Especial!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
							return false;
						}
						con.setLimite(valor);
					}else {
						if(! con.getTipo().equals("Poupança")) {
							JOptionPane.showMessageDialog(null, "Esta conta não é do tipo Poupança!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
							return false;
						}
						con.setRendimento(valor);
					}
				}
			}
		}
		return true;
	}
	
	public boolean aplicaDinheiro(int conta, double valor) {
		for(Cliente cli: this.meusClientes) {
			for(Contas con: cli.getContas()) {
				if(conta == con.getConta()) {
					con.depositar(valor);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean retiraDinheiro(int conta, double valor) {
		for(Cliente cli: this.meusClientes) {
			for(Contas con: cli.getContas()) {
				if(conta == con.getConta()) {
					con.sacar(valor);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean transfere(int conta, int conta2, double valor) {
		int i =0;
		for(Cliente cli : this.meusClientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					i++;
				}else if(conta2 == con.getConta()) {
					i++;
				}
			}
		}
		
		if(i<2 || conta == conta2) {
			JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		String senha = JOptionPane.showInputDialog("Digite sua senha:").strip();
		if(! senha.equals(this.getSenha())) {
			JOptionPane.showMessageDialog(null, "Senha incorreta!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		for(Cliente cli : this.meusClientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					if(! con.sacar(valor)) {
						JOptionPane.showMessageDialog(null, "Valor Insuficiente!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
						return false;
					}
				}
			}
		}
		
		for(Cliente cli : this.meusClientes) {
			for(Contas con : cli.getContas()) {
				if(conta2 == con.getConta()) {
					con.depositar(valor);
				}
			}
		}
		return true;
	}
}
