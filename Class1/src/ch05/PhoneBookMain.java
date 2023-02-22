package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		// while 0.종료 1. 저장, 2.전체조회, 3.선택조회, 4. 선택삭제, 5.전체 삭제
		// Tip -> 데이터 입력
		// 샘플 데이터 만들어서 활용
		Scanner sc = new Scanner(System.in);
		Map<String, String> phoneNum = new HashMap<>();

		System.out.println(">>>기능을 선택해 주세요<<<");
		String userInput = "-1";
		String userInputNum = "-1";
		String userInputName = "-1";
		int userSelect = 0;
		while (!userInput.equals("0")) {
			System.out.println("0.종료 1. 저장, 2.전체조회, 3.선택조회, 4. 선택삭제, 5.전체 삭제");
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("이름을 입력해주세요.");
				userInputName = sc.nextLine();
				System.out.println("번호를 입력해주세요.");
				userInputNum = sc.nextLine();
				phoneNum.put(userInputName, userInputNum);
				System.out.println(" 저장되었습니다.");

				// 전체 조회
			} else if (userInput.equals("2")) {
				if (phoneNum.get(userInputName) == null) {
					System.out.println("조회할 대상이 없습니다.");
				}
				for (String key : phoneNum.keySet()) {
					System.out.print("이름 : " + key);
					System.out.println(", 번호 : " + phoneNum.get(key));
				}
				// 선택조회
			} else if (userInput.equals("3")) {
				System.out.println("누구의 번호를 조회 하시겠습니까?");
				userInputName = sc.nextLine();
				if (phoneNum.get(userInputName) == null) {
					System.out.println(userInputName + "이라는 이름이 없습니다.");
				} else {
					System.out.print("이름 : " + userInputName);
					System.out.println(", 번호 : " + phoneNum.get(userInputName));
				}
				// 선택 삭제
			} else if (userInput.equals("4")) {
				if (phoneNum.get(userInputName) == null) {
					System.out.println("삭제할 대상이 없습니다.");
				} else {
					System.out.println("누구를 삭제 하시겠습니까?");
					userInputName = sc.nextLine();
					phoneNum.remove(userInputName);
					System.out.println(userInputName + "의 번호가 삭제되었습니다.");
				}
				// 전체 삭제
			} else if (userInput.equals("5")) {
				System.out.println("정말 전체 삭제 하시겠습니까? YES =1, NO=2");
				userInput = sc.nextLine();
				if (userInput.equals("1")) {
					phoneNum.clear();
					System.out.println("전체 삭제 되었습니다.");
				} else if (userInput.equals("2")) {
				}

			}
			if (userInput.equals("0")) {
				System.out.println("종료되었습니다.");
			}
		}
	}
}
