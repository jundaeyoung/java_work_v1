package ch04;

public class BuyDTO {
	String username;
	String prodName;
	int price;
	int amount;

	public BuyDTO(String username, String prodName, int price, int i) {
		this.username = username;
		this.prodName = prodName;
		this.price = price;
		this.amount = i;
	}

	public String getUsername() {
		return username;
	}

	public String getProdName() {
		return prodName;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

}
