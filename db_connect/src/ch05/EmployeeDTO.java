
package ch05;

public class EmployeeDTO {

	private String empNo;
	private String firstName;
	private String lastName;
	private String title;
	private String count;
	
	private String gender;
	
	

	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmpNo() {
		return empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getTitle() {
		return title;
	}
	
	
}
