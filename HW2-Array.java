package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] firstArray = new int[]{21,54,77,9,23,85,41,2,97,45};
        //System.out.println(firstArray.length);

        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < secondArray.length; i++){
            secondArray[i] = firstArray[i];
        }
        firstArray[2] = 66;

        //Print all elements of first array using a for-loop

        for (int i = 0; i <firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        //Print all elements of second array using a for-loop

        for (int i = 0; i <secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
    }
}
