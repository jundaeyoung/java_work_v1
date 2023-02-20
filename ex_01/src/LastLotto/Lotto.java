package LastLotto;

public abstract class Lotto {

	public abstract void create();

	public abstract void dedup();

	public abstract void ascending();

	public abstract void middleResult();

	public abstract void compare();
	public void result() {
		
	}

	public void run() {
		create();
		ascending();
		middleResult();
		compare();
	}

}
