package Questionthird;

public class Student {
	
	
	int roll;
	String name;
	String address;
	String collageName;
	
	public Student() {
		
	}
	
	public Student(int roll,String name,String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	public Student(int roll,String name,String address,String collageName) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	
	public void setrRoll(int roll) {
		this.roll=roll;
	}
	
	public int getroll() {
		return this.roll;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address=address;
		
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setCollageName(String collageName) {
		this.collageName=collageName;
		
	}
	
	public String getCollageName() {
		return this.collageName;
	}
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			Student s1=new Student(101,"pallu","Pune");
			s1.setCollageName("NIT");
			return s1;
		}
		else {
			Student s2=new Student(106,"Rutu","wardha","RTMNU");
			return s2;
		}
	}

	public static void main(String[] args) {
		

	}

}