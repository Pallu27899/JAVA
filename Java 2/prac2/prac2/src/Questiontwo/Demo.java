package Questiontwo;

public class Demo {
	public Demo() {
	this(57);
		System.out.println("inside zero argument constructor Demo()" );

	}

	public Demo(int x) {
	this(89, 57);
		System.out.println("inside one argument constructor Demo(int x)");
		System.out.println(x);
	}

	public Demo(int x, int y) {
		this("pallu");
		System.out.println("inside two argument constructor Demo(int x,int y)");
		System.out.println(x + ","+ y);
	}

	public Demo(String s) {
		System.out.println("inside one(String) argument constructor Demo(String s)");
		System.out.println(s);
	}

	public static void main(String[] args) {

		Demo d1 = new Demo();
	
		
	
	}
}