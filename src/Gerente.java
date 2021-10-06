
public class Gerente extends Usuario{

	
	
	
	public void setSenha(String senha) {
		this.senha = senha;
		
		
	}
	
	public void setLogin(String login) {
		this.login = login;
		
	}
	
	public Usuario cadastrarUsuario(int tipo,String newUsuario,String newSenha){
		
		if(tipo == 0) {
			
			Cliente c = new Cliente();
			c.setGerente(login);
			c.setLogin(newUsuario);
			c.setSenha(newSenha);
			return c;
			
		}else {
			
			Gerente g = new Gerente();
			g.setLogin(newUsuario);
			g.setSenha(newSenha);
			return g;
		}
			
		
	}
	
	
	public void verificaClienteConta() {
		///verifica as contas dos seus Clientes
		
		
	}
	
	
	public void verificaInfosConta() {
		
	}
	
	
	
	

}
