package com.evolution.c2.problem4;

import java.util.Scanner;

public class Main {
	
	public static Laptop getLaptop(String laptopPurpose) {
		System.out.println(laptopPurpose);
		Laptop l1=new Laptop();
		CPU c1=new CPU();
		GraphicCard g=new GraphicCard();
		if(laptopPurpose=="gaming") {
			
			l1.setName("Acer");
			l1.setColor("Black");
			l1.setCompanyName("Radeon");
			l1.setPurpose("gaming");
			
			c1.setClockSpeed(3200);
			c1.setManufacturer("Radeon");
			c1.setProcessor("Ryzen 9 5800H");
			l1.cpu=c1;
			
			g.setCapacity("16GB");
			g.setManufacturer("Radeon");
			g.setSeries("RTX 3050 Ti");
			l1.graphicCard=g;
			return l1;
		}
		else if(laptopPurpose=="business") {
			l1.setName("Aero 13\r\n"
					+ "");
			l1.setColor("Rose Gold");
			l1.setCompanyName("HP");
			l1.setPurpose("gaming");
			
			c1.setClockSpeed(1800);
			c1.setManufacturer("Intel");
			c1.setProcessor("i5 10210U");
			l1.cpu=c1;
			
			g.setCapacity("Integrated");
			g.setManufacturer("Intel");
			g.setSeries("Iris Xe");
			l1.graphicCard=g;
			System.out.println();
			System.out.println(l1.getCompanyName());
			
			return l1;
		}
		else {
			return null;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String laptopName=sc.next();
		System.out.println("Company name ");
		String CompanyName=sc.next();
		System.out.println("Laptop Color");
		String color=sc.next();
		System.out.println("Laptop Purpose");
		String purpose=sc.next();
		System.out.println("Cpu's Manufacturer");
		String manufacturer=sc.next();
		System.out.println("Cpu's Processo");
		String processor=sc.next();
		System.out.println("Cpu's ClockSpeed ");
		String clockSpeed=sc.next();
//		System.out.println("Graphic card's Manufacturer");
//		String manufacturer=sc.next();
		System.out.println("Graphic card's Series");
		String series=sc.next();
		System.out.println("Graphic card's Capacity");
		String capacity=sc.next();
		System.out.println("Enter laptopPurpose");
		String laptopGame=sc.next();
//		System.out.println(laptopGame);
		Laptop gamingLaptop=getLaptop(laptopGame);
		
		
		gamingLaptop.displayDetails();
		

	}

}
