package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMainTest {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(10);
		set.add(100);
		
		System.out.println(set.toString());
		
		set.remove(1);
		System.out.println(set.toString());
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
