package com.evolution.c2.problem3;

public class Ticket {
	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
	int totalAmount=-1;
	System.out.println("Available tickets: "+availableTickets);
	this.availableTickets=this.availableTickets-noOfTickets;
	
	
		if(availableTickets>0) {
			totalAmount=noOfTickets*this.price;
			System.out.println("Total amount: "+totalAmount);
			System.out.println("Available ticket after booking: "+availableTickets);
			return totalAmount;
		}
		else {
			System.out.println("Total amount: "+totalAmount);
			System.out.println("Available ticket after booking: "+availableTickets);
			return totalAmount;
		}
	}

}