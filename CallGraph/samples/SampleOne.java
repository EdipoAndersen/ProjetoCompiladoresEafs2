package samples;
public class SampleOne {
	
	public static void metodoNaoChamado(){
		int x = 0;
	}

	public static void metodoQueVaiSerChamado(int k){
		//N�o faz nada, pois n�o � isso que estamos analisando na classe.; 
	}	
	
	public static void main(String[] args) {
		SampleOne.metodoQueVaiSerChamado(0);	
	}
	
}




