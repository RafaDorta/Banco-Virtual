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
	
	public void aplicaDinheiro(Cliente cliente, int conta, double valor) {
		//aplicação de dinheiro pra um determinado cliente
	}
	
	public void transfere(Cliente c1, Cliente c2, int conta1, int conta2,double valor) {
		//faz transferencia de dinheiro entre dois clientes 
	}
	
	public void retira(Cliente cliente, int conta,double valor) {
		//faz retiradas maiores de R$ 110.000,00
	}
	
	public void ajustaDados(Cliente cliente, int conta, int tipo, double newLimite, double newTaxa) {
		//dadastra/edita os limites de retiradas negativas e taxa de juros da poupança
	}
}
