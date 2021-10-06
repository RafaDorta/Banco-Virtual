import java.util.ArrayList;

public class Cliente extends Usuario {

	private String gerente;
	ArrayList<Contas> c = new ArrayList();

	
	public void setLogin(String login) {
		this.login = "Julia";
		
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
}
