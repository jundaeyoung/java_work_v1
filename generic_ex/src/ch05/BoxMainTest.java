package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
		Box<Item> box = new Box<>();
		
		Item doll = new Doll();
		Item ball = new Ball();
		
		box.put(doll);
		doll.put();
		box.isEmpty();
		box.printIsEmpty();
		System.out.println("=====================");
		
		box.take(doll);
		doll.take();
		box.printIsEmpty();
		
		
	}
}
