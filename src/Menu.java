import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;

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
			    	clienteAtual=c;
			    	return true;
			    }
			}
		} else {
			for (Gerente g : gerentes) {
			    if(login.equals(g.getLogin())&& senha.equals(g.getSenha())) {
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
	
	public static String retornaNome(int flag) {
		if(flag == 1)
			return clienteAtual.getNome();
		
		return gerenteAtual.getNome();
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
			System.out.print(gerenteAtual.getNome());
			newCliente.setGerente(gerenteAtual.getNome());
			clientes.add(newCliente);
			
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
		}
		return true;
	}
	
	public static String verificaExtratoCliente(int conta) {
		return clienteAtual.verificaExtrato(conta);
	}
	
	public static boolean verificaConta(int conta) {
		for(Cliente cli : clientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					
					return true;
				}
				
			}
			
		}
		
		return false;
	}
	
	
	public static boolean alteraDados(double valor,int conta, int flag) {
		
		for(Cliente cli : clientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					if(flag == 0) {
					if(! con.getTipo().equals("Especial")) {
						JOptionPane.showMessageDialog(null, "Esta conta n\306o eh do tipo Especial!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
						return false;
					}
					con.setLimite(valor);
					}else {
						if(! con.getTipo().equals("Poupança")) {
							JOptionPane.showMessageDialog(null, "Esta conta n\306o eh do tipo Poupança!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
							return false;
						}
						con.setRendimento(valor);
						
					}
				}
				
			}
			
			
			
		}
		
		
		return true;
	}
	
	
	public static boolean transfere(int conta, int conta2, double valor) {
		int i =0;
		for(Cliente cli : clientes) {
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
		if(! senha.equals(gerenteAtual.getSenha())) {
			return false;
		}
		
		for(Cliente cli : clientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					if(! con.sacar(valor)) {
						
						
						JOptionPane.showMessageDialog(null, "Valor Insuficiente!","BANCO JURA",JOptionPane.WARNING_MESSAGE);
						return false;
					}
				}
			}
		}
		
		for(Cliente cli : clientes) {
			for(Contas con : cli.getContas()) {
				if(conta2 == con.getConta()) {
					con.depositar(valor);
				}
			}
		}
		
		
		return true;
	}
	
	
	public static String verificaClienteContas() {
		return gerenteAtual.verificaNomeCliente(clientes);
	}
	
	public static String verificaInfosConta(int conta) {
		for(Cliente cli : clientes) {
			for(Contas con : cli.getContas()) {
				if(conta == con.getConta()) {
					return con.infosConta();
				}
			}
		}
		return "inexistente";
	}
	
	public static boolean aplicaDinheiroG(int conta, double valor) {
		for(Cliente cli: clientes) {
			for(Contas con: cli.getContas()) {
				if(conta == con.getConta()) {
					con.depositar(valor);
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean retiraDinheiroG(int conta, double valor) {
		for(Cliente cli: clientes) {
			for(Contas con: cli.getContas()) {
				if(conta == con.getConta()) {
					con.sacar(valor);
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static void alteraSenha(String senhaAntiga,String newSenha,int flag) {
		if(flag==1) {
			clienteAtual.alteraSenha(senhaAntiga,newSenha);
		} else {
			gerenteAtual.alteraSenha(senhaAntiga, newSenha);
		}
	}
	
	
	public static String encrypt(String user) {
	
		return new String(Base64.getEncoder().encode(user.getBytes()));
	}
	
	public static String desencrypt(String user) {
		
		return new String(Base64.getDecoder().decode(user.getBytes()));
	}
	
	
	
	public static void salvarSair() throws IOException {
		String string = "";
		FileWriter writer = new FileWriter("DataBase.txt"); 
		for(Cliente c: clientes) {
			
		  string += c.getNome() + " " + c.getLogin()+ " "  + c.getSenha()+ " "  + c.getGerente() + " ";
		}
		string += "-";
		for(Gerente g : gerentes) {
			
			string += g.getNome() + " " + g.getLogin()+ " "  + g.getSenha()+ " ";
		}
		string += "-";
		string = encrypt(string);
		 writer.write(string);
		writer.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
Scanner useDelimiter = new Scanner(new File("DataBase.txt"), "UTF-8").useDelimiter("\\A");
String texto = useDelimiter.next();
		
			
		
		texto = desencrypt(texto);
		
		int flag = 0;
		int tipo = 0;
		int espaco = 0;
		String nome= "";
		String login= "";
		String senha= "";
		String gerente= "";
		
		
		
		for(int i =0;i<texto.length();i++) {
			char l = texto.charAt(i);
			
			if(flag == 0) {
				
			if (espaco != 4) {
				if(Character.compare(l, ' ') == 0)
				{
					
					tipo++;
					espaco++;
					
				}else {
				
				switch(tipo) {
				case 0: nome += l;break;
				case 1: login += l; break;
				case 2: senha += l; break;
				case 3: gerente += l; break;
				}
				}
			}else {
				
				espaco = 0;
				Cliente c =new Cliente();
				c.setNome(nome);
				
				c.setLogin(login);
				
				c.setSenha(senha);
				
				c.setGerente(gerente);
				
				clientes.add(c);
				
				nome = "" + l;
				login = "";
				senha ="";
				gerente="";
				tipo =0;
				
				
			}
			
			if(Character.compare(l, '-') == 0) {flag = 1; espaco = 0; continue;}
				
		}else {
			if (espaco != 3) {
				
				if(Character.compare(l, ' ') == 0)
				{
					
					tipo++;
					espaco++;
				}else {
				switch(tipo) {
				case 0: nome += l; break;
				case 1: login += l; break;
				case 2: senha += l; break;
				}
				
				}
			}else {
				espaco = 0;
				tipo=0;
				Gerente g =new Gerente();
				g.setNome(nome);
				
				g.setLogin(login);
				
				g.setSenha(senha);
				
				
				gerentes.add(g);
				
				nome = "" + l;
				login = "";
				senha ="";
				gerente="";
				
			}
			
			
			
		}
		}
		
		
	
		PrimeiraTela.main(args);

	}

}
