package collection01;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>();
		// In this list only string type of object will be allowed.
		// Generic are introduced in java to ensure the type safety(version5).

		// ------------------------//

		ArrayList<Object> list = new ArrayList<Object>();// default capacity is 10
		String str1 = new String("First");
		String str2 = "Second";
		Integer iobj = new Integer(100);
		Double dobj = new Double(10.50);
		int x = 10;

		list.add(str1);
		list.add(str2);
		list.add(iobj);
		list.add(dobj);
		list.add(x);

		list.add(str1);
		list.add(str2);
		list.add(iobj);
		list.add(dobj);
		list.add(x);
		list.add(x);

		System.out.println(list);
	}

}
