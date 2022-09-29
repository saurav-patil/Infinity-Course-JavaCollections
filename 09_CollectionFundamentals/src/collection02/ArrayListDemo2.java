package collection02;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		String str1 = new String("First");
		String str2 = "Second";

		list.add(str1);
		list.add(str2);
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");

		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		list.add("ABCD");
		

		for (Object element : list) {
			String str = (String) element; // Avoid classCastEXception - Type safety problem
			System.out.println(str.length());

		}

	}

}
