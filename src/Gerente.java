
public class Gerente extends Usuario{

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public Usuario cadastrarUsuario(int tipo,String newUsuario,String newSenha) {
		if(tipo == 0) {
			Cliente c = new Cliente();
			c.setGerente(this.login);
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
		//verifica as contas dos seus Clientes
	}
	
	public void verificaInfosConta() {
		//verifica as informa��es de cada uma das contas
	}
	
	public void aplicaDinheiro(Cliente cliente, int conta, double valor) {
		//aplica��o de dinheiro pra um determinado cliente
	}
	
	public void transfere(Cliente c1, Cliente c2, int conta1, int conta2) {
		//faz transferencia de dinheiro entre dois clientes 
	}
	
	public void retira(Cliente cliente, int conta) {
		//faz retiradas maiores de R$ 110.000,00
	}
	
	public void ajustaDados(Cliente cliente, int conta, int tipo, double newLimite, double newTaxa) {
		//dadastra/edita os limites de retiradas negativas e taxa de juros da poupan�a
	}
}