package Lotto2;

public class LastLottoMainTest {

	public static void main(String[] args) {
		
		LastLotto lottomachine = new LastLottoMachine();
		LastLotto lottoUser = new LastLottoUser();
		
		lottomachine.run();
		lottoUser.run();
	}
}
