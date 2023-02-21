package ex01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@example.com");
		Student student2 = new Student(2, "Bob", "bob@example.com");

		// 과정 생성
		Course course1 = new Course(1, "Math", "introduction to Mathematics");
		Course course2 = new Course(2, "English", "introduction to English");

		// 1번학생이 Math 과정을 등록한다.
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);

		// 학생 데이터에 내가 등록한 정보를 저장 시킬 수 있다.

//		ArrayList<Enrollment>list = new ArrayList<>();
//		list.add(enrollment1);
//		student1.setEnrollments(list); // 통으로 list를 저장하는 녀석이다.

		// 학생의 기능을 이용
		student1.addEnrollments(enrollment1); // 자료 구조에 저장 (0번째 인덱스에 저장)
		student1.addEnrollments(enrollment3);// 자료구조에 저장 ( 1번째 인덱스에 저장)

		student2.addEnrollments(enrollment2); // Bob 틍록 신청 정보 저장

		// Bob가 신청한 과정의 이름을 화면에 출력하시오.(학생으로 접근)
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		// English
		// Alice가 신청한 과정의 이름을 화면에 출력하시오.
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			System.out.println(student1.getEnrollments().get(i).getCourse().getName());
		} // Math, English

		// 위 코드는 학생과 과목을 Enrollment 클래스를 통해서 연결하는 예제 코드이다.

		// Enrollment1 학생 정보와 과목정보를   출력해주세요.
		// 학생 이름 : 이름
		// 수강 과목 : 과목 이름
		//----------------
		System.out.println("학생이름 : " + enrollment1.getStudent().getName());
		System.out.println("수강 과목 : "+ enrollment1.getCourse().getName());
		
		// 문제 4
		// ArrayList 를 생성해서 Enrollment를 저장해주세요.
		ArrayList<Enrollment>list = new ArrayList<>();
		list.add(enrollment1);
		list.add(enrollment2);
		list.add(enrollment3);
		for (Enrollment e : list) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("--------------");
		}
		
		// foreach Alice에 수강하고 있는 과목 이름을 다시 한번더 출력하시오.
		for (Enrollment enrollment : student1.getEnrollments()) {
			System.out.println(enrollment.getCourse().getName());
		}
		
		
	}
}
