package com.evolution.c2.problem4;

public class CPU {
	String manufacturer;
	String processor;
	double clockSpeed;
	
	CPU(){
		
	}

	public CPU(String manufacturer, String processor, double clockSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.clockSpeed = clockSpeed;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer=manufacturer;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public void setProcessor(String processor) {
		this.processor=processor;
	}
	
	public String getprocessor() {
		return this.processor;
	}
	
	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed=clockSpeed;
	}
	
	public double getClockSpeed() {
		return this.clockSpeed;
	}

}
