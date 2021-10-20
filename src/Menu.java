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
	
	public static boolean acoesGerente(int acao,int conta, int conta2,double valor,int flag) {
		
		switch(acao) {
			case 1:
				return gerenteAtual.aplicaDinheiro(conta, valor);
			case 2:
				return gerenteAtual.transfere(conta, conta2, valor);
			case 3:
				return gerenteAtual.retiraDinheiro(conta, valor);
			case 4:
				return gerenteAtual.alteraDados(valor, conta, flag);
		}
		
		return false;
	}
	
	public static boolean criaUsuario(String login, String senha, String nome, int flag) {
		return gerenteAtual.criaUsuario(login, senha, nome, flag, clientes, gerentes);
	}
	
	public static boolean verificaConta(int conta) {
		return gerenteAtual.verificaConta(conta);
	}
	
	public static String verificaClienteContas() {
		return gerenteAtual.verificaNomeCliente();
	}
	
	public static String verificaInfosConta(int conta) {
		return gerenteAtual.verificaInfosConta(conta);
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
		String string= "";
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
					if(Character.compare(l, ' ') == 0) {
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
					espaco = 0;
				}
			
				if(Character.compare(l, '-') == 0) {
					flag = 1; 
					espaco = 0; 
					continue;
				}
				
			}else {
				if (espaco != 3) {
					if(Character.compare(l, ' ') == 0) {
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
					Gerente g =new Gerente();
					g.setNome(nome);
					g.setLogin(login);
					g.setSenha(senha);
					gerentes.add(g);
					
					nome = "" + l;
					login = "";
					senha ="";
					gerente="";
					espaco = 0;
					tipo=0;
				}
			}
		}
		PrimeiraTela.main(args);
	}
}
