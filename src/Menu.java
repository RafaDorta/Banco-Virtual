import java.util.ArrayList;


public class Menu{

	
	Contas x = new Contas();
	ArrayList<Contas> c = new ArrayList<Contas>();
		
		
		public static void programa(int tipo) {
			if(tipo == 1) {
				TelaInicialG x = new TelaInicialG();
				x.main(null);
			}else if(tipo == 0) {
				TelaInicial x = new TelaInicial();
				x.main(null);
			}else {
			
				PrimeiraTela x = new PrimeiraTela();
				x.main(null);
			
				
			}
			
			
		}
		
		
			public static void main(String[] args) {
				
				programa(-1);
				
				
			}
		
		
		
		
		
		

	}





	


