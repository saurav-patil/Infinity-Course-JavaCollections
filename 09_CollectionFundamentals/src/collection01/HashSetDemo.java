package collection01;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		int x = 1000; //primitive
		Integer obj = 100;//reference type
		set.add(100);//autoboxing
		set.add(x);//autoboxing
		set.add(obj);
		set.add("Hello");
		set.add("Hello");
		System.out.println(set);
	}

}

//Feature
//AutoBoxing and AutoUnboxing
//set.add(x)//autoboxing
//int y = obj2.intValue();//autounboxing