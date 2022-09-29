package collection01;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("LTI");
		list.add("Capgemini");
		list.add("JPMorgan");
		list.add("ITC");
		list.add(0, "TCS");
		list.add("Atos");
		list.add("HSBC");
		list.remove(4);
		// System.out.println(list);
		for (String s : list) {
			System.out.println("Name:" + s);
			System.out.println("Length" + s.length());
		}
	}

}
//Use linkedList Incase of frequent updation/deletion etc.
