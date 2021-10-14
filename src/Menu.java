import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private static Cliente clienteAtual;
	private static Gerente gerenteAtual;
	public static int nmrContas = 1000;
	
	public static boolean checkLogin(String login, String senha, int flag) {
		
				
		if(flag==1) {
			for (Cliente c : clientes) {
			    if(login.equals(c.getLogin())&&senha.equals(c.getSenha())) {
			    	
				    	System.out.printf("%s, %s", c.getSenha(),senha);
			    	clienteAtual=c;
			    	return true;
			    }
			}
		} else {
			for (Gerente g : gerentes) {
			    if(login.equals(g.getLogin())&& senha.equals(g.getSenha())) {
			    	
			    	System.out.printf("%s, %s", g.getSenha(),senha);
			    	gerenteAtual=g;
			    	return true;
			    }
			}
		}
		
		return false;
	}
	
	public static int retornaNmrConta() {
		return nmrContas -1;
	}
	
	///public static double retornaSaldoConta(int conta) {
	///	return clienteAtual.verificaSaldo(conta);
	//}
	
	public static String retornaNome(int flag) {
		if(flag == 1) {
		return clienteAtual.getNome();
		}else {
			return gerenteAtual.getNome();
		}
	}
	
	
	public static boolean criaUsuario(String login, String senha, String nome, int flag) {
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
			newCliente.setGerente(gerenteAtual.getNome());
			clientes.add(newCliente);
			
		} else { //criar gerente
			Gerente newGerente = new Gerente();
			newGerente.setLogin(login);
			newGerente.setSenha(senha);
			newGerente.setNome(nome);
			gerentes.add(newGerente);
		}
		
		return true;
	}
	
	public static boolean acoesCliente(int acao,String tipoConta,int conta,double valor) {
		switch(acao)
		{
			case 1 :
				clienteAtual.abrirConta(nmrContas, tipoConta);
				nmrContas++;
				break;
			case 2 :
				
			if(	clienteAtual.aplicaDinheiro(conta, valor)) {
				JOptionPane.showMessageDialog(null, "Dinheiro Adicionado a Conta!");
			}else {
				JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
			}
				
				break;
			case 3 :
				if(	clienteAtual.retiraDinheiro(conta, valor)) {
					JOptionPane.showMessageDialog(null, "Dinheiro Retirado da Conta!");
				}else {
					JOptionPane.showMessageDialog(null, "Ups, algo deu errado !","BANCO JURA",JOptionPane.WARNING_MESSAGE);
				}
				break;
			case 4 :
				
				if(!clienteAtual.verificaSaldo(conta)) {
					JOptionPane.showMessageDialog(null, "Numero da Conta errado!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
					return false;
				}
				break;
			case 5 :
				clienteAtual.verificaExtrato(conta);
				break;
		}
		
		return true;
	}
	
	public static void acoesGerente(int acao,Cliente cli,int conta,double valor,Cliente cli2,int conta2,int tipoConta,double limite,double taxa) {
		switch(acao)
		{
			case 1 :
				///gerenteAtual.verificaClienteConta(clientes);
				break;
			case 2 :
				gerenteAtual.verificaInfosConta();
				break;
			case 3 :
				gerenteAtual.aplicaDinheiro(cli, conta, valor);
				break;
			case 4 :
				gerenteAtual.transfere(cli, cli2, conta, conta2, valor);
				break;
			case 5 :
				gerenteAtual.retira(cli, conta, valor);
				break;
			case 6 :
				gerenteAtual.ajustaDados(cli, conta, tipoConta, limite, taxa);
				break;
		}
	}
	
	
	public static String verificaClienteContas() {
		
		
		return gerenteAtual.verificaNomeCliente(clientes);
	}
	
	public static void alteraSenha(String senhaAntiga,String newSenha,int flag) {
		if(flag==1) {
			clienteAtual.alteraSenha(senhaAntiga,newSenha);
		} else {
			gerenteAtual.alteraSenha(senhaAntiga, newSenha);
		}
	}
	
	public static void main(String[] args) {
		
		Gerente admin = new Gerente();
		admin.setLogin("admin");
		admin.setSenha("admin");
		admin.setNome("Dani");
		gerentes.add(admin);
		Cliente cli = new Cliente();
		cli.setLogin("1234");
		cli.setSenha("0000");
		cli.setNome("Julia");
		cli.setGerente("Dani");
		clientes.add(cli);
		
		Cliente cl = new Cliente();
		cl.setLogin("2256");
		cl.setSenha("0000");
		cl.setNome("Rafael");
		cl.setGerente("Dani");
		clientes.add(cl);
		
		PrimeiraTela.main(args);

	}

}
