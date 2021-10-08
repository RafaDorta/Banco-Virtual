import java.util.ArrayList;

public class Menu {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private static Cliente clienteAtual;
	private static Gerente gerenteAtual;
	
	public boolean checkLogin(String login, String senha, int flag) {
		Cliente cli = new Cliente();
		cli.setLogin("aaa");
		cli.setSenha("123");
		clientes.add(cli);
				
		if(flag==1) {
			for (Cliente c : clientes) {
			    if(login.equals(c.getLogin())) {
			    	clienteAtual=c;
			    	return true;
			    }
			}
		} else {
			for (Gerente g : gerentes) {
			    if(login.equals(g.getLogin())) {
			    	gerenteAtual=g;
			    	return true;
			    }
			}
		}
		
		return false;
	}
	
	public static void criaUsuario(String login, String senha,int flag) {
		if(flag==1) { //criar cliente
			Cliente newCliente = new Cliente();
			newCliente.setLogin(login);
			newCliente.setSenha(senha);
			newCliente.setGerente(gerenteAtual.login);
			clientes.add(newCliente);
			
		} else { //criar gerente
			Gerente newGerente = new Gerente();
			newGerente.setLogin(login);
			newGerente.setSenha(senha);
			gerentes.add(newGerente);
		}
	}
	
	public static void acoesCliente(int acao,int tipoConta,int conta,double valor) {
		switch(acao)
		{
			case 1 :
				clienteAtual.abrirConta(1111, tipoConta);
				break;
			case 2 :
				clienteAtual.aplicaDinheiro(conta, valor);
				break;
			case 3 :
				clienteAtual.retiraDinheiro(conta, valor);
				break;
			case 4 :
				clienteAtual.verificaSaldo(conta);
				break;
			case 5 :
				clienteAtual.verificaExtrato(conta);
				break;
		}
	}
	
	public static void acoesGerente(int acao,Cliente cli,int conta,double valor,Cliente cli2,int conta2,int tipoConta,double limite,double taxa) {
		switch(acao)
		{
			case 1 :
				gerenteAtual.verificaClienteConta();
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
		admin.setSenha("senha");
		gerentes.add(admin);
		
		PrimeiraTela.main(args);

	}

}
