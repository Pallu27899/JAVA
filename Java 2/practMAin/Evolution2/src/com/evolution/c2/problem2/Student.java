package com.evolution.c2.problem2;
public class Student {
	float rollNumber;
	String studentName;
	float marks;

	Student(){
		System.out.println("Zero Argument Constructor");
	}

	public Student(float rollNumber, String studentName, float marks) {
		
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public void setRollNumber(float rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public float getRollNumber() {
		return this.rollNumber;
	}
	
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	
	public String GetStudentName() {
		return this.studentName;
	}

	public void setMarks( float marks) {
		this.marks=marks;
	}
	
	public float getMarks() {
		return this.marks;
	}
	
	
	
	
	
	

}