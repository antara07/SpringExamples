package com.wipro.spring.ioc.models;

import java.util.Iterator;
import java.util.List;

public class Student {

	private String studentId;
	private String studentName;
	private List<Test>studentTest;
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Test> getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}
	
	public void display()
	{
		System.out.println("Id : "+studentId);
		System.out.println("Name : "+studentName);
		System.out.println("Test Details : ");
		Iterator<Test> iterator = studentTest.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			System.out.println();
		}
	}
}
