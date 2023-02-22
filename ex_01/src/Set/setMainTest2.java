package Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class setMainTest2 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();

		while(set1.size()!=6) {
			set1.add(getRandomNumber());
		}
		System.out.println(set1.toString());
	}
	
	public static int getRandomNumber() {
		
		Random rd= new Random();
		return rd.nextInt(45)+1;
	}
}
