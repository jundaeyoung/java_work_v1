package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
	public static void main(String[] args) {

		// List 계열
		List list0;
		// 순서가 있고 중복 가능

		ArrayList<Integer> list = new ArrayList<>(); // 자료구조 - 정수를 담을 수 있는 메모리 공간 선언
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<String>();

		// 값 추가 방법
		list.add(3); // 인덱스 0 번 - 3
		list.add(null); // 인덱스 1번 - null
		list.add(100); // 인덱스 2번 - 100
		// 3, null, 100
		list.add(1, 20); // 인덱스 번호, 값 할당 ( 인덱스 1번 - 20 )
		// 3, 20, null, 100
		// arrayList add(index, value) <-- 이 메서드는 끼워 넣기다.
		System.out.println(list.toString());
		System.out.println(list.size());
		// 값 삭제 방법
		list.remove(2); // 해당 하는 요소에 접근해서 제거 ( 인덱스 2번 - null )
		System.out.println(list.toString());
		System.out.println(list.size());

		// 매번 삭제 할려면
//		list.remove(0);
//		list.remove(1);
//		list.remove(2);
//
//		list.clear(); // <--전체 삭제
//		System.out.println(list.toString()); // 비어있다.
//		System.out.println(list.size());// 사이즈는 0

		// 값에 화면을 출력하는 방법
		System.out.println("-----------------");
//		System.out.println(list.get(2)); // 배열은 인덱스 연산처리, ArrayList .get() 연산을 호
//		System.out.println(list.get(0)); // ->3
//		System.out.println(list.get(20)); // 오류 난다.

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// list -> 3,20,100
		for (int abc상관없음 : list) {
			System.out.println("변수명 아무거나 됌 : " + abc상관없음);

		}

		// 값 검색 기능 사용해 보기
		// 리스트 안에 값이 있는지 없는지 확인하기
		// 3, 20, 100 ->70이 있는지 확인해보기
		// 70 --> int --> 자동으로 형변환 클래스 타입으로 interger
		// contains 요소 안에 있는지 없는지 판별 - true, false 반환
		System.out.println(list.contains(70)); // --> false 70 값이 없다.
		System.out.println(list.contains(100)); // -- > true로 100 값이 있다.

		// 100 값이 몇번째 인덱스 요소에 있니 ?
		// indexOf를 사용하면된다.
		System.out.println(list.indexOf(100)); // --> 2
		// 값이 있으면 해당하는 인덱스 번호를 return 한다.
		// 만약 값이 없으면?
		System.out.println(list.indexOf(70)); // --> -1
		// 반환 값이 없으면 -1을 return 한다.

		// 추가...
		Iterator<Integer> iter = list.iterator(); // 반복자 녀석으로 형변환해 줌 terator()
		while (iter.hasNext()) { // iter.hasNext () == true
			System.out.println("값 확인 방법 : " + iter.next());   // -> 3, 20, 100
		}

	}// end of main
}// end of class

class Student {

}