package ch07;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		// 문제
		// d object에 있는 value값을 화면에 출력하세요.

		System.out.println(a.b.c.d.value);

		for (String e : a.b.c.d.arrayList) {
			System.out.println(e);
		}

	}
}
