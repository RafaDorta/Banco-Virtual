import java.util.ArrayList;

public class Menu {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	
	public boolean checkLogin(String login, String senha) {
		
		Cliente cli = new Cliente();
		cli.setLogin("aaa");
		cli.setSenha("123");
		clientes.add(cli);
		
		for (Cliente c : clientes) {
		    if(login.equals(c.getLogin())) {
		    	return true;
		    }
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		PrimeiraTela x = new PrimeiraTela();
		x.main(args);

	}

}
