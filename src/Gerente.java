
public class Gerente extends Usuario{

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void verificaClienteConta() {
		//verifica as contas dos seus Clientes
	}
	
	public void verificaInfosConta() {
		//verifica as informações de cada uma das contas
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
