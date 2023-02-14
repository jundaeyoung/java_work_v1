package ex_03;

public class Customer {

	protected  int customerID;
	protected  int price;
	protected String customerGrade;
	protected double bounsRatio;
	protected double  bonus;
	
	public Customer() {
		customerGrade = "SILVER";
		bounsRatio = 0.01;
	}
	
	public double CalcPrice (int price) {
		bonus = price * bounsRatio;
		return bonus;
	}
	
	public void showInfo() {
		System.out.println("회원님의 등급은"+customerGrade + "이며 , 보너스 포인트는"+bonus+"입니다.");

	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBounsRatio() {
		return bounsRatio;
	}

	public void setBounsRatio(double bounsRatio) {
		this.bounsRatio = bounsRatio;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
