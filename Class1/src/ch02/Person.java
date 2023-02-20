package ch02;

public class Person {
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, Address address) {
//		address = new Address("연수로 249번길", "서울", " 자이 303호", " 1234-456");
		this.name = name;
		this.age= age;
		this.address = address; // 메인에서 받아옴
		
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
	
	
}
