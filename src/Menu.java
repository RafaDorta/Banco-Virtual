import java.util.ArrayList;

public class Menu {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	
	public boolean checkLogin(String login, String senha, int flag) {
		Cliente cli = new Cliente();
		cli.setLogin("aaa");
		cli.setSenha("123");
		clientes.add(cli);
				
		if(flag==1) {
			for (Cliente c : clientes) {
			    if(login.equals(c.getLogin())) {
			    	return true;
			    }
			}
		} else {
			for (Gerente g : gerentes) {
			    if(login.equals(g.getLogin())) {
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
			clientes.add(newCliente);
			
		} else { //criar gerente
			Gerente newGerente = new Gerente();
			newGerente.setLogin(login);
			newGerente.setSenha(senha);
			gerentes.add(newGerente);
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
