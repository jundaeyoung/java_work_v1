package ch02;

import java.util.regex.Matcher;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 현재 잔액 100_000 만원
		BankAccount backAccount = new BankAccount();
		
		Father father = new Father(backAccount);
		
		Mother mother = new Mother(backAccount);
		
		
		// 아버지 입금하기
		father.start(); // 3초 걸림		
		// 어머니 출금하기
		mother.start(); 
		
		// 정상처리 : 10 +1만원 -5천원 = 105000원
	}
}
