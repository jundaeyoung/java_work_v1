package ch01;

public class Worker extends Thread {

	public static void main(String[] args) {

	

	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("==");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
