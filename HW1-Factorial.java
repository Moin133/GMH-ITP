package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("** This program calculates the factorial of a number **");

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        String Input = in.nextLine();

        Integer number = Integer.valueOf(Input);
        BigInteger fact = BigInteger.valueOf(1);

        for (int i = 1; i <= number ;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of "+number+" is: "+fact);




    }
}
