package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        for(int i = 0; i <= number; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers up to "+number+" is "+sum);
    }
}
