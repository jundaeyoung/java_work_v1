package ch06;

public class Bank {
	
	// 아무것도 지정하지 않으면 default ( 접근 제어 지시자 이다.)
	// int balance;
	// private는 class Bank (여기 안에서만 접근 가능하다)
	private int balance;
	public String name;

	// 입금 하다
	public void deposit(int money) {
		balance += money; 
		showInfo();
	}

	// 출금 하다
	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌 잔액은 : " + balance + "입니다.");
	}
	
	// get 메서드 만들기
	// get ->read only 성질을 가진다. 
	//         -> 데이터를 주입 받지 못하고 리턴만 시킨다.
	public int getBalance() {
		return this.balance;
	}
	
	// set 메서드 만들기 -> 외부에서 값을 주입 받을 수 있도록 설계
	public void setBalance(int money) {
		// 방어적 코드를 작성
		if(money<=0) {
			System.out.println("잘못된 입력 값 입니다.");
			return; // <-- 함수, 메서드의 실행을 종료한다. 
						   //    	리턴을 사용하지 않고 else문을 사용해도 된다.
		}
		
		this.balance = money;
	}
}
