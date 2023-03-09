package ch03;

import java.sql.Date;

public class EmployeeDTO {

	int empNO;
	String birthDate;
	String firstName;
	String lastName;
	String gender;
	String hireDate;

	public EmployeeDTO(int empNO, String birthDate, String firstName, String lastName, String gender, String hireDate) {
		this.empNO = empNO;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empNO=" + empNO + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", hireDate=" + hireDate + "]";
	}

	
	
}
