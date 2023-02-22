package ch05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapMainTest {
	public static void main(String[] args) {

		Map map;
		// key와 value 구조로 데이터를 저장한다.
		Map<String, String> map1 = new HashMap<>(); // value - null 값 허용
		Hashtable<String, String> map2 = new Hashtable<>(); // value - null값 허용 안함

		// C R U D

		map1.put("A01", "김포공항정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		map1.put("B01", "인천공항 정문");
		map1.put("B02", "인천공항 후문");
		map1.put("B03", "인천공항 로비");
		map1.put("C01", null);

		// map 자료 구조 전체 값 확인하기
		System.out.println(map1);

		// 값 꺼내는 방법 - 키 값을 통해서 값을 꺼낼수 있다.
		System.out.println(map1.get("B03"));
		System.out.println(map1.get("c01"));
		// 없는 키 값을 요청하면 결과로 null이 반환된다.
		System.out.println(map1.get("b01"));

		// 사이즈 확인
		System.out.println("size1 :" + map1.size());
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}

		// Map 원래 순서가 없지만 잠깐 응용하면
		// key 값으로 for문 정도는 활용할 수 있다.
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		map3.put(4, "E");

		for (int i = 0; i < map3.size(); i++) {
			System.out.println("value : " + map3.get(i));
		}

		// 삭제 하는 방법
		map1.remove("C01");
		// map1.toString 해도 된다.map1에 toString이 오버라이드 되어있음
		System.out.println(map1);

//		map1.clear();
		System.out.println(map1.toString());

		// 자료구조는 반복문과 if 문이 많이 활용된다.
		// map 계열을 for문과 활용하는 방법
		// map1<String, String>
//		Entry<String, String> entry1 = (Entry<String, String>) map1.entrySet();

		// key,value를 한번에 꺼낼수 있다. - 반복하면서!
		System.out.println("----------------");
		for (Entry<String, String> entry2 : map1.entrySet()) {
			System.out.println("key : " + entry2.getKey());
			System.out.println("value : " + entry2.getValue());
		}

		System.out.println("-----------------");

		System.out.println(map1.keySet().size());
		// map 계열의 값을 꺼낼때는 key값으로접근해 value값을 반환한다.
//		String str = map1.get("A01");
		for (String key : map1.keySet()) {
			System.out.println("key : " + key); // 반복 돌면서 키 값 확인
			System.out.println("value : " + map1.get(key));
		}
		

	}
}
