import java.util.ArrayList;

public class Menu {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
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
	
	public static void main(String[] args) {
		
		Gerente admin = new Gerente();
		admin.setLogin("bbb");
		admin.setSenha("456");
		gerentes.add(admin);
		
		PrimeiraTela.main(args);

	}

}
