package ex_03;

public class MainTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(111);
		customerLee.CalcPrice(100);
		customerLee.showInfo();
			
			
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerID(222);
		customerKim.CalcPrice(100);
		customerKim.showInfo();
	}
}

