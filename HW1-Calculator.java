package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("** This program performs basic arithmatic operation based on user input **");

        Scanner in1 = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        String userInput1 = in1.nextLine();

        int first = Integer.valueOf(userInput1);

        Scanner in2 = new Scanner(System.in);
        System.out.println("Please enter the second number: ");
        String userInput2 = in2.nextLine();

        int second = Integer.valueOf(userInput2);

        Scanner in3 = new Scanner(System.in);
        System.out.println("Which operation do you want to perform? (press 1 for addition, press 2 for subtraction, press 3 for multiplication, press 4 for division):  ");
        String userInput3 = in3.nextLine();

        int operation = Integer.valueOf(userInput3);

        double result;

        switch (operation){
            case 1:
                result = first + second;
                break;
            case 2:
                result = first - second;
                break;
            case 3:
                result = first * second;
                break;
            case 4:
                result = ((double)first / second);
                break;
            default:
                result = 0;
                break;
                }
System.out.println("The result is: " + result);

    }
}
