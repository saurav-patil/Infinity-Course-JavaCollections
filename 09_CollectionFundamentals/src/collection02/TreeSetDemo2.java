package collection02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	// Number is super class of all the wrapper class except char and booleann
	public static void main(String[] args) {
		Set<Double> set = new TreeSet<Double>();

		// Here autoboxing comes into picture as only objects are allowed in
		// collections.
		set.add(100.5);
//		set.add(10);
		set.add(45.5);
		set.add(84.6);
		set.add(7.0);
		set.add(100.2);

		System.out.println(set);
	}

}
