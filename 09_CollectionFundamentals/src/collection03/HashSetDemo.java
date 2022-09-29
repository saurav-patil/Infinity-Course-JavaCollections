package collection03;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();

		Student student1 = new Student(101, "Test1", 60);
		Student student2 = new Student(102, "Test2", 55);
		Student student3 = new Student(101, "Test1", 60);

		set.add(student1);
		set.add(student2);
		set.add(student3);

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());

		for (Student s : set) {
			System.out.println(s);
		}

	}

}
