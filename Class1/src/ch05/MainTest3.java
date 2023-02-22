package ch05;

import java.util.HashMap;
import java.util.Map;

public class MainTest3 {
	public static void main(String[] args) {
		// Map 자료구조를 이용해서 전화번호를 저장해주세요.
		// 1단계 - String,String
		Map<String, String> phoneBook = new HashMap<>();
		phoneBook.put("나", "010-1111-5678");
		phoneBook.put("동생", "010-2222-5678");
		phoneBook.put("아빠", "010-3333-5678");
		phoneBook.put("엄마", "010-4444-5678");
		// key값은 중복 될 수 없다.
		phoneBook.put("엄마", "010-4444-5678");
		
		System.out.println(phoneBook);
		for(String key : phoneBook.keySet()) {
			System.out.println("key : " + key);
			System.out.println("value : " + phoneBook.get(key));
		}
		
		
		// 2단계 - String, Object(Persion)
	}
}
