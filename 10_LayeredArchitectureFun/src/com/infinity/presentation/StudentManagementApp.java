package com.infinity.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.infinity.dao.StudentDao;
import com.infinity.model.Student;

//Presentation Layer
public class StudentManagementApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's Id: ");
		int id = sc.nextInt();
		System.out.println("Enter student's Name: ");
		String name = sc.next();
		System.out.println("Enter student's Score: ");
		double score = sc.nextDouble();

		Student student1 = new Student(id, name, score);
		Student student2 = new Student(102, "Kohli", 40);
		StudentDao studentdao = new StudentDao();
		studentdao.createStudent(student1);
		studentdao.createStudent(student2);

		ArrayList<Student> students = studentdao.readAllStudent();

		for (Student stu : students) {
			System.out.println(stu);
		}

		System.out.println("------------------------------------------------------------------");

		// readbyId
		studentdao.checkStudentId(101);

		System.out.println("------------------------------------------------------------------");
		
		// readbyName
		studentdao.checkStudentName("Kohli");
		sc.close();
	}

}
