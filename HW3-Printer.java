package com.printer;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	
	private String name;
	private int inkLevel;
	private int numberOfPagesPrinted;
	private int numberOfPagesRemaining;
	private boolean bothSidePrint;
	private Queue<String> printingQueue = new LinkedList<>();
	
	public Printer(String name, int inkLevel, boolean bothSidePrint) {
		this.name = name;
		cartridgeLevel(inkLevel);
		this.bothSidePrint = bothSidePrint;
		this.numberOfPagesPrinted = 0;
		this.numberOfPagesRemaining = 200;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void cartridgeLevel(int x) {
		if((this.inkLevel +x) < 25) {System.out.println("Ink level low. Please refill.");}
		else if ((this.inkLevel + x) < 100) {this.inkLevel += x;}
		else {this.inkLevel = 100;}
		System.out.println(this.getName() + "'s ink level is at " + this.inkLevel + "%");
	}
		
	public int getNumberOfPagesPrinted() {
		return this.numberOfPagesPrinted;
	}

	public boolean getBothSidePrint() {
		return this.bothSidePrint;
	}

	public int getinkLevel() {
		return this.inkLevel;
		
	}

	public int getNumberOfPagesRemaining() {
		return this.numberOfPagesRemaining;
	}

	public void paperRefill(int x) {
		if ((this.numberOfPagesRemaining + x) < 200 ) {this.numberOfPagesRemaining += x;}
		else {this.numberOfPagesRemaining = 200;}
		System.out.println("The paper tray is full");		
	}

	public void print(String fileName) {
		addToQueue(fileName);
		printQueue();		
	}
	
	public void addToQueue(String fileName) {this.printingQueue.add(fileName);}
	
	public String removeFromQueue() {return this.printingQueue.remove();}
	
	public void printQueue() {
		while(this.printingQueue.peek() != null) {
			if(this.numberOfPagesRemaining != 0) {
				System.out.println("Printing " +removeFromQueue());
				this.numberOfPagesPrinted += 1;
				this.numberOfPagesRemaining -= 1;
				this.inkLevel -= 5;
			}		
		}
	}

}
