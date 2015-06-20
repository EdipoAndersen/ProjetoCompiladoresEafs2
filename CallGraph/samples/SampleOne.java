package samples;
public class SampleOne {
	
	public static void metodoNaoChamado(){
		int x = 0;
	}

	public static void metodoQueVaiSerChamado(int k){
		//Não faz nada, pois não é isso que estamos analisando na classe.; 
	}	
	
	public static void main(String[] args) {
		SampleOne.metodoQueVaiSerChamado(0);	
	}
	
}




