import java.util.ArrayList;

public abstract class Contas {

	private int conta;
	private double saldo;
	private String nome;
	private String tipo;
	private double limite;
	private double rendimento;
	
	public ArrayList<String> extrato = new ArrayList<String>();
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getConta() {
		return this.conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract boolean sacar(double X);
	
	
	
	public void depositar(double X) {
			this.saldo += X;
			extrato.add("Deposito de " + X);
	}
	
	public String extrato() {
		String todoExtrato= "";
		for(String ext : extrato) {
			todoExtrato += "\t" + ext + "\n";
		}
		return todoExtrato;
	}
	
	public String infosConta() {
		String infos="";
		infos += "Nome do cliente: " + this.getNome() + "\n";
		infos += "_______________________________\n";
		infos += "Número da conta: " + this.getConta() + "\n";
		infos += "_______________________________\n";
		infos += "Tipo de conta: " + this.getTipo() + "\n";
		infos += "_______________________________\n";
		infos += "Extrato: " + "\n" + this.extrato() + "\n";
		return infos;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}	
}
