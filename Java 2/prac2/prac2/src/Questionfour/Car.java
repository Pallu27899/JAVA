package Questionfour;
public class Car {
	String model;
	String companyName;
	String color;
	Engine engine=new Engine();
	
	
	Car(){
		
	}
	public Car(String model,String companyName,String color,Engine e) {
		this.model=model;
		this.companyName=companyName;
		this.color=color;
		this.engine=e;
		
	}
}