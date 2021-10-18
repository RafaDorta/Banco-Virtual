import java.util.ArrayList;

public class Gerente extends Usuario{
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String verificaNomeCliente(ArrayList<Cliente> clientes) {
		String Nomes = "";
		for(Cliente c : clientes) {
			if(this.getNome().equals(c.getGerente())) {
				Nomes += c.printContas();
			}
		}
		return Nomes;
	}
}
