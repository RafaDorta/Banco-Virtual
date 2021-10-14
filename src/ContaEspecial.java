
public class ContaEspecial extends Contas{
	
	private double limite;
	
	public ContaEspecial()
	{
		setTipo("Especial");
		

	}
	
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public void sacar(double X) {
		if(getSaldo() - X < getLimite()) {
			
		}
		else {
			setSaldo(getSaldo() - X);	
			extrato.add("Saque de " + X);
		}
		
	}
}
