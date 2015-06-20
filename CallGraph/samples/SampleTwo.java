package samples;
public class SampleTwo {
	
	public int recursaoMutuaA(int x){
		if(x>5){
			return x;
		}else{
			return recursaoMutuaB(int x);
		}
	}
	
	public int recursaoMutuaB(int x){
		if(x>5){
			return x;
		}else{
			return recursaoMutuaA(int x);
		}
	}
	
	public static void main(String[] args) {
		SampleTwo tester = new SampleTwo();
		int resposta = tester.recursaoMutuaA(1);	
	}
	
}

