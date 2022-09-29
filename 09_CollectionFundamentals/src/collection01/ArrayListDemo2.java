package collection01;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
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

//for frequent removal /updation / deletion arraylist is not recommeneded instead use linked list.
