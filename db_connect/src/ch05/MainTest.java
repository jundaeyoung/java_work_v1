package ch05;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();
//		ArrayList<EmployeeDTO> templist = employeeDAO.showTitleEmpInfo("Staff");
		
//		for (int i = 0; i < templist.size(); i++) {
//			String empNo = templist.get(i).getEmpNo();
//			String firstName = templist.get(i).getFirstName();
//			String title = templist.get(i).getTitle();
//			System.out.println("empNo : " + empNo);
//			System.out.println("firstName : " + firstName);
//			System.out.println("title : " + title);
//
//		
//		}
		
		ArrayList<EmployeeDTO> templist = employeeDAO.showCountSalary("Georgi","Facello");
		
		for (int i = 0; i < templist.size(); i++) {
			String firstName = templist.get(i).getFirstName();
			String lastName = templist.get(i).getLastName();
			String count = templist.get(i).getCount();
			
			System.out.println("firstName : " + firstName);
			System.out.println("lastName : " + lastName);
			System.out.println("count : " + count);

	}
}
}