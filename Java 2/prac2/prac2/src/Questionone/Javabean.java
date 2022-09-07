package Questionone;

public class Javabean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using zero argument constructor
		Student student1 = new Student();
		student1.setRoll(06);
		student1.setName("pallu");
		student1.setAge(78);
		student1.setMarks(550);
          
		
		Student student2 = new Student(04, "Rutu",78, 900);
		System.out.println("Student1 details: ");
		
		student1.showDetails();
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Age is :"+student2.getAge());
		System.out.println("Marks is :"+student2.getMarks());
	}

}
