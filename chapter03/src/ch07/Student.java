package ch07;

public class Student {

	// 학번과 이름을 정의
	private String name;
	private int studentNum;

	// 생성자 정의
	public Student(String name, int studentNum) {
		this.name = name;
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return "[" + this.name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student targetStudent = (Student) obj; // 다운캐스팅
			if (this.name == targetStudent.name) {
				System.out.println("동명이인 입니다.");
				return true;
			} else {
				System.out.println("동명이인이 아닙니다.");

			}
		}
		return false;
	}
	// toString -> 학번, 이름이 화면에 출력할 수 있도록 설계
	// equals 메서드를 재 정의 해주세요.!!
	// 이름이 같다면 동명이인입니다 라고 출력해주세요.

}
