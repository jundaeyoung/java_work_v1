package ch01;

public class Student {
	
	//상태 (속성) ( 멤버변수 ) 
	int studentId;//0으로 초기화
	String studentName;//null로 초기화
	String address;
	double height; //0.0으로 초기화
	boolean isMarred; // false 로 초기화
	
	
	//기능
	
	//공부한다.
	public void study() {
		System.out.println( studentName +  " 학생이 공부를 합니다.");
	}
	
	// 휴식한다.
	public void breakTime() {
		System.out.println( studentName + " 학생이 휴식을 합니다."); 
	}
	
	
	// 학생의 상태를 보여주는 상태창
	public void showInfo() { 
		// int n1; // 지역변수
		System.out.println("==========상태창==========");
		System.out.println("학생에 ID 값은 : " + studentId);
		System.out.println("학생에 이름은 : " + studentName);
		System.out.println("학생에 주소는 : " + address);
		System.out.println("==========상태창==========");
	}
	
	// 함수와 메서드의 차이점
	// 메서드란
	// 자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	// 멤버함수(member function) 이라고 한다.
	// 결론 : 메서드는 자신의 변수를 활용해서 객체의 기능을 구현 하는 것
	
	// 학생의 기능(메서드) 3가지 정의해 주세요.
	public void studentstudy() {
		System.out.println(studentName + "학생이 공부를 합니다. ");
	}
	public void studenteat() {
		System.out.println(studentName + "학생은 식사를 합니다.");
	}
	public void studentrun() {
		System.out.println(studentName + "학생이 달리기를 합니다.");
	}
	
}// end of class
