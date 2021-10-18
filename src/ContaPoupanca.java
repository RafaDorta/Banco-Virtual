
public class ContaPoupanca extends Contas{


	
	public ContaPoupanca() {
		setTipo("Poupança");
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
