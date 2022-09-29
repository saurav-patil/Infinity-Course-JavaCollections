package com.infinity.dao;

import java.util.ArrayList;

import com.infinity.model.Student;

//Data access object layer
//Dao layer is responsible for perfroming CRUD {CREATE,READ,UPDATE,DELETE} operations.

public class StudentDao {
	ArrayList<Student> database = new ArrayList<Student>();

	public boolean createStudent(Student student) {
		boolean result = database.add(student);
		return result;
	}

	// method with return type as arraylist bcoz its returning database
	public ArrayList<Student> readAllStudent() {
		return database;
	}

	//readbyId
	public void checkStudentId(int checkstudId) {
		for (Student stu : database) {
			if (stu.getStudentId() == checkstudId) {
				System.out.println(stu);
			}
		}

	}

	//readbyName
	public void checkStudentName(String checkstudName) {
		for (Student stu : database) {
			if (stu.getStudentName().equals(checkstudName)) {
				System.out.println(stu);
			}
		}

	}

//	public void updateStudent() {
//
//	}
//
//	public void deleteStudent() {
//
//	}

}
