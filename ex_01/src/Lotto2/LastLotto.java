package Lotto2;

public abstract class LastLotto {
	
	public abstract void create();
	public abstract void dedup();
	public abstract void ascending();
	public abstract void result();
	public void compare() {
	}
	public void run() {
		create();
		ascending();
		result();
		compare();
	}
}
