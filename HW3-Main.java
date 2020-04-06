package com.printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer P1 = new Printer("OfficePrinter", 40, true);
		P1.print("File1");
		P1.print("File2");
		P1.print("File3");
		P1.print("File4");
		P1.print("File5");
		System.out.println("Ink level is at "+ P1.getinkLevel()+ "%");
		
	}

}
