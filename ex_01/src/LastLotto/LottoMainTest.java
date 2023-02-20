package LastLotto;

public class LottoMainTest {
	public static void main(String[] args) {
		
		
		LottoResult result = new LottoResult();
		Lotto lottoMachine =  new LottoMachine();
		
		
		
		Lotto lottoUser =  new LottoUser();
		
		
		lottoUser.run();
		
		lottoMachine.run();
		result.run();
		
	}
}
