package ch07;

public class Person1 {

	// this란 3가지
	// 1. 자기 자신을 가르킨다.
	// 2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다. (유지보수에 이점이 생긴다.)
	// 3. 자기 자신의 주소 (참조 값, 주소 값) 을 반환 시킬 수 있다.
	private String name;
	private int age;
	private String phone;
	private String gender;

	public Person1(String name, int age) {
		// 1.자기 자신을 가르키는 this.
		this.name = name;
		this.age = age;
	}

	// 생성자는 객체가 메모리에 올라 갈 때 제일 먼저 실행하는 코드이다.
	public Person1(String name, int age, String phone) {
		// 2. 생성자에서 다른 생성자를 호출 함
		// this.name = name;
		// this.age = age;
		this(name, age);
		this.phone = phone;
	}

	public Person1(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}

	// 자기 자신을 반환하는 this는 디자인 패턴 중에 빌더 패턴을 만들어 낼 수 있다.
	public Person1 getPerson() {
		// 3. 자기 자신의 주소 값을 반환한다.
		return this;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}

}// end of Person class

// xxx.java 파일 하나에 여러개의 클래스를 작성할 수 있다.
// 단, xxx.java 파일 하나에 public 을 가지는 클래스는 단 하나만 선언할 수 있다.
//public class PersonMainTest{ = 사용 불가
// 접근 제어 지시자 : default -> ch07에 있는 클래스들은 사용 가능하다.
class PersonMainTest1 {

	// static 메인 함수는 잠시 자리를 빌려서 사용한다.
	public static void main(String[] args) {

		Person1 person1 = new Person1("홍길동", 100);
		person1.showInfo();

	}// end of main
}// end of PersonMainTest class
