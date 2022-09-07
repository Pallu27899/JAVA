package com.evolution.c2.problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Ticket t1=new Ticket();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of bookings: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the available tickets: ");
		t1.availableTickets=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			
			System.out.println("Enter the ticketid: ");
			t1.ticketid=sc.nextInt();
			
			System.out.println("Enter the price: ");
			t1.price=sc.nextInt();
			
			System.out.println("Enter the no of tickets: ");
			int noOfTickets=sc.nextInt();
			
			t1.calculateTicketCost(noOfTickets);
		
		}
	}

}