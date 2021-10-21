
public class ContaCorrente extends Contas {
		
	public ContaCorrente() {
		setTipo("Corrente");
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


