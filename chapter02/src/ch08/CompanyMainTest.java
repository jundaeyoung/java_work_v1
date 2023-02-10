package ch08;

public class CompanyMainTest {
	public static void main(String[] args) {
		
		//Company company = new Company(); 사용불가
		Company company = Company.getInstance();
		System.out.println(company);
		//ch08.Company@7c30a502
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		System.out.println(company2);
		System.out.println(company3);


		
	}
}
