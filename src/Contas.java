import java.util.ArrayList;

public abstract class Contas {

	private int Conta;
	private double Saldo;
	private String Tipo;
	public ArrayList<String> extrato = new ArrayList<String>();
	
	public String getTipo() {
		return Tipo;
	}
	
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
	public int getConta() {
		return Conta;
	}
	
	public void setConta(int conta) {
		Conta = conta;
	}
	
	public double getSaldo() {
		return Saldo;
	}
	
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	
	
	
	
	public abstract void sacar(double X);
	
	public void depositar(double X)
	{
			Saldo = Saldo + X;
			extrato.add("Deposito de " + X);
	}
	
	public void extrato() {
		for(String ext : extrato) {
			System.out.println(ext);
		}
	}
	
	public void infosConta() {
		System.out.printf("Número da conta: ",this.getConta());
		System.out.printf("\nTipo de conta: ",this.getTipo());
	}
}
