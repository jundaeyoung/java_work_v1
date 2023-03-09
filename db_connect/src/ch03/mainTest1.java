package ch03;

import java.util.ArrayList;

public class mainTest1 {
	
	public mainTest1() {
		
		
		// 디비 접근해서 기능 수행하는 녀석은?
		EmployeeDao employeeDao = new EmployeeDao();
		ArrayList<EmployeeDTO> list = employeeDao.select(10007);
		
		// SWINT 화면일 경우라면
		System.out.println("여기는 main");
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	
}	
