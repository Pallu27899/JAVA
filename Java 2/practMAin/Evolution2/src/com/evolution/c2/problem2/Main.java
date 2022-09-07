package com.evolution.c2.problem2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Students you want to enter:");
		int n=sc.nextInt();
		System.out.println("============================================");
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Roll Number :");
			float roll=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the Name :");
			String name=sc.nextLine();
			
			System.out.println("Enter the marks :");
			float marks=sc.nextInt();
			
			System.out.println("Student Detail  "+i);
			
			Student s1=new Student(roll,name,marks);
			float x=s1.getRollNumber();
			System.out.println("Student Roll Number:"+x);
			
			String na=s1.GetStudentName();
			System.out.println("Student Name: "+na);
			
			float m=s1.getMarks();
			System.out.println("Student Mark: "+m);
			
			System.out.println("============================");
			
			
		}
	
	}

}