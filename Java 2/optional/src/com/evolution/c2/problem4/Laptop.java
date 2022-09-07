package com.evolution.c2.problem4;

public class Laptop {
	
	String color;
	String companyName;
	String name;
	String purpose;
	
	CPU cpu= new CPU();
	GraphicCard graphicCard;
	
	Laptop(){
		
	}
	

	public Laptop(String color, String companyName, String name, String purpose, CPU cpu, GraphicCard graphicCard) {
		super();
		this.color = color;
		this.companyName = companyName;
		this.name = name;
		this.purpose = purpose;
		this.cpu = cpu;
		this.graphicCard = graphicCard;
	}


	
	
	public void setColor(String color) {
		this.color=color;
		
	}
	public String getColor() {
		return this.color;
	}
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
		
	}
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return this.name;
	}
	
	public void setPurpose(String purpose) {
		this.purpose=purpose;
		
	}
	public String getPurpose() {
		return this.purpose;
	}
	
	public void setCPU(CPU cpu) {
		
		
	}
	public void setgraphicCard(GraphicCard graphicCard) {
		
		
		
	}
	


	void displayDetails() {
		System.out.println("Laptop Details");
	
		
		
		System.out.println("Laptop Name:"+this.name);
		System.out.println("Company name: "+this.companyName);
		System.out.println("Laptop Color"+this.color);
		System.out.println("Laptop Purpose"+this.purpose);
		System.out.println("Cpu's Manufacturer"+this.cpu.manufacturer);
		
	}


}
