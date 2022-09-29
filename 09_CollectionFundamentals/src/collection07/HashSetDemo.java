package collection07;

import java.util.HashSet;

//hashset internally going to use hashmap to store the value.
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Rohit");
		set.add("Virat");
		set.add("Chahal");
		set.add("ABD");

		System.out.println(set);

		set.add("Saurav");
		
		System.out.println(set);

	}

}

//Feature
//AutoBoxing and AutoUnboxing
//set.add(x)//autoboxing
//int y = obj2.intValue();//autounboxing