package com.dependencyinjection;

import com.springwebapp.Student;

public class StudentInformation {

	Student student;
	
	
	/*
	 * public Student getStudent() { return student; }
	 * 
	 * 
	 * public void setStudent(Student student) { this.student = student; }
	 */


	public void printInformation() {
		
		System.out.println("Student information...." + student);
	}


	public StudentInformation(Student student) {
		super();
		this.student = student;
	}
}
