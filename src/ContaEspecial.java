
public class ContaEspecial extends Contas{
	
	
	public ContaEspecial() {
		setTipo("Especial");
	}
	

	
	@Override
	public boolean sacar(double X) {
		if(getSaldo() - X <  - getLimite()) {
			return false;
		}
		
		setSaldo(getSaldo() - X);	
		extrato.add("Saque de " + X);
		return true;
	}
}
