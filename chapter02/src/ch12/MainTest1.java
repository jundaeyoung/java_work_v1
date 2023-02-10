package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 기본적으로 추상 클래스는 new 할 수 없다.
		// abstract --> 개발자한테 직접 new를 막아버림 
		// Animal animal = new Animal();  <- 추상클래스여서 new 사용 불가
		
		Animal animalHuman = new Human();
		animalHuman.hunt();
		System.out.println("==============");
		Animal animalPerson = new Person();
		animalPerson.hunt();
	}
}
