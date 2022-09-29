package collection02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();

		// Tree set arranges elements by default in ascending order
		// Add method returns a boolean value
		boolean flag1 = set.add(100);// if we want to catch the value

		set.add(10);
		set.add(45);
		set.add(84);
		set.add(7);

		boolean flag2 = set.add(100);

//		System.out.println("Flag:" + flag1);
//		System.out.println("Flag:" + flag2);

		System.out.println(set);
	}

	// set interface will not allow duplicate values hence we will be getting false
	// for line 22

}
