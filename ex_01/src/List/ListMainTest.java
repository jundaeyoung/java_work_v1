package List;

import java.util.ArrayList;
import java.util.List;

public class ListMainTest {
	public static void main(String[] args) {
		List list;

		ArrayList<Integer> list1 = new ArrayList<>();
//		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();

		list1.add(3);
		list1.add(null);
		list1.add(100);
		list1.add(1, 20);
		System.out.println(list1.toString());

		list1.remove(2);
		System.out.println(list1.toString());

		System.out.println("------------");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		for (int intlist : list1) {
			System.out.println(intlist);
		}

	}
}
