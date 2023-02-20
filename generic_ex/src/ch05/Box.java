package ch05;

public class Box <T extends Item>{

	private T contents;
	
	public Box() {
		this.contents = null;
	}
	
	// 넣다.
	public void put(T item) {
		this.contents=item;
	}
	
	// 꺼내다.
	public T take(T item) {
		this.contents = item;
		this.contents =null;
		return item;
	}
	
	public boolean isEmpty() {
		return this.contents == null;
		}
	public void printIsEmpty() {
		if(isEmpty() == true) {
			System.out.println("비어 있습니다.");
		} else {
			System.out.println("비어 있지 않습니다.");
		}
	}
	}
	

