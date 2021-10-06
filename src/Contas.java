
public class Contas {

	private int Conta;
	private double Saldo;
	private double Limite;
	private double Rendimento;
	private int Tipo;
	
	public int getTipo() {
		return Tipo;
	}
	
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	
	public double getRendimento() {
		return Rendimento;
	}
	
	public void setRendimento(double rendimento) {
		Rendimento = rendimento;
	}
	
	public void Rende()
	{
		Saldo = Saldo + (Saldo * Rendimento/ 100);
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
	
	public double getLimite() {
		return Limite;
	}
	
	public void setLimite(double limite) {
		Limite = limite;
	}
	
	public void sacar(double X)
	{
		if(Saldo - X < Limite) {
			System.out.printf("Dinheiro Insuficiente");
		}
		else {
			Saldo = Saldo - X;	
		}
		
	}
	
	public void depositar(double X)
	{
			Saldo = Saldo + X;	
	}
	
	
}
