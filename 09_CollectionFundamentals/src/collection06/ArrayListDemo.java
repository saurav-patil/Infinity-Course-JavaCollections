package collection06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		Student student1 = new Student(101, "Sachin", 50);
		Student student2 = new Student(102, "Virat", 92);
		Student student3 = new Student(103, "Chahal", 80);
		Student student4 = new Student(104, "Yuvi", 85);

		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);

		displayList(list);

		// for Sorting the list
		// Collections.sort(list); //it expects us to implment comparator interface in
		// Student Class

		//Collections.sort internally calls the compare or compareto method
		// COMPARATOR INTERFACE(Pass list,object)
		Collections.sort(list, new StudentIdSorter());
		displayList(list);
		
		Collections.sort(list, new StudentScoreSorter());
		displayList(list);
	}

		
	
	private static void displayList(List<Student> studentList) {
		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext())// checks if next object is present or not
		{
			Student str = itr.next();
			System.out.println(str);
		}
		System.out.println("-------------------------------------------------------------");
	}

}
