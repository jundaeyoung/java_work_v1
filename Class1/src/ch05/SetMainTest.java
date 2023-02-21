package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class SetMainTest {
	public static void main(String[] args) {

		// 순서가 없고 중복 불가
		Set<Integer> set1 = new HashSet<>();
		// 값을 추가하는 방법
		set1.add(1);
		set1.add(10);
		set1.add(100);
		set1.add(500);
		set1.add(1); // 중복 안됨
		set1.add(1);

		System.out.println(set1.toString()); // 1,100,500,10 순서 자기 맘대로 나옴
		System.out.println(set1.size()); // --> 4

		// 삭제 하는 방법
		set1.remove(500);
		set1.remove(1000); // 없는 요소를 삭제 요청해도 오류 나지 않음
//		set1.clear(); // 요소 전체 삭제 방법
		System.out.println(set1.toString()); // [ 1,100,10 ]

		// set 계열을 반복문 처리할때 lterator 타입으로 변환해서 처리 할 수 있다.
		Iterator<Integer> iter = set1.iterator();
		
		while(iter.hasNext()) {  // has.next 다음 요소가 있니 없니? true false 반환
			System.out.println(iter.next());
		}
		
//		try {
//			System.out.println("next 사용1 : " + iter.next());
//			System.out.println("next 사용2 : " + iter.next());
//			System.out.println("next 사용3 : " + iter.next());
//		} catch (NoSuchElementException e) {
//			System.out.println("자료 구조 안에 값이 없어");
//		}
	}// end of main
}// end of class
