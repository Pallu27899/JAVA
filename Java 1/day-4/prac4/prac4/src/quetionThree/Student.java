package quetionThree;

public class Student {
	
	
   int no;
   int RollNo;
   String name;
   int marks;
   
   
   void displayStudentDetails(){
	 System.out.println("Student number:" + no);
     System.out.println("Roll is :" + RollNo);
     System.out.println("Name is :" + name);
     System.out.println("marks is :" + marks);
     
   }
     
	public static void main(String[] args) {
	
		Student s1 =new Student();
		s1.no = 1;
		s1.RollNo = 10;
		s1.name = "Pallavi";
		s1.marks = 100;
		
		s1.displayStudentDetails();
		
		System.out.println("###################");
	     
	
		
		Student s2 =new Student();
		s2.no = 2;
		s2.RollNo = 15;
		s2.name = "Nikita";
		s2.marks = 99;
		
		s2.displayStudentDetails();
	
		
		
		   s1 = new Student( );
		   s2 = s1;
	
		
		
		
	}

}
