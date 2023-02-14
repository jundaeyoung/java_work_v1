package ch07;

public class MainTest10 {

	public static void main(String[] args) {

		Student student1 = new Student("전대영", 1);
		Student student2 = new Student("전대영", 2);
		Student student4 = new Student("김다정", 4);
		// 자식 객체에 존재하는 각각에 equals 메서드 호출이다.
		student1.equals(student2);
		 student1.equals(student4);
		 
		 Boolean result1 = student1 ==student2;
		 System.out.println(result1); //  주소값을 나타내기에 당연히 다르다.

	}
}
