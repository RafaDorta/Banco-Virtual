
public class ContaPoupanca extends Contas{

	private double rendimento;
	
	public ContaPoupanca() {
		setTipo("Poupança");
	}
	
	public double getRendimento() {
		return rendimento;
	}
	
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void Rende() {
		setSaldo(getSaldo()+ (getSaldo()*getRendimento()/100)); 
		extrato.add("Rendimento de " + (getSaldo() * getRendimento()/ 100));
	}

	@Override
	public boolean sacar(double X) {
		if(getSaldo() - X < 0) {
			return false;
		}
		
		setSaldo(getSaldo() - X);	
		extrato.add("Saque de " + X);
		return true;
	}
}
