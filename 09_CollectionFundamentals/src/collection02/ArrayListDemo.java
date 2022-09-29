package collection02;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
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

		for (Object element : list) {
			String str = (String) element;// gives classCast Exception as we cant typecast two completely diffobject
			System.out.println(str.length());

		}

	}

}
