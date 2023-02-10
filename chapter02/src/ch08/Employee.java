package ch08;

/**
 * 
 * @author 전대영 static 변수와 멤버 변수의 활용!!!
 */
public class Employee {

	public static int serialNum;
	private int employeeId;
	private String name;
	private String department;

	// 생성자를 호출 한다는 것은?
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}

	
	public int getEmployeeId() {
		return employeeId;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// get, set 만들기

}
