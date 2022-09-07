package Questionthird;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s=new Student();
		
		
		Student s1=Student.getStudent(true);
		System.out.println("Name: "+s1.getName());
		System.out.println("Collage Name: "+s1.getCollageName());
		System.out.println("Roll :"+s1.getroll());
		System.out.println("address :"+s1.getAddress());
		
		
		Student s2=Student.getStudent(false);
		System.out.println("Name: "+s2.getName());
		System.out.println("Collage Name: "+s2.getCollageName());
		System.out.println("Roll :"+s2.getroll());
		System.out.println("address :"+s2.getAddress());
	}

}