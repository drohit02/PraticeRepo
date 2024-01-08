package com.Simple_Java;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String [] args) {

        int num1;
        int num2;

        System.out.println("Swapping of number with third variable");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num 1 ");
        num1 = sc.nextInt();
        System.out.println("Enter the num 2 ");
        num2 = sc.nextInt();

        System.out.println("Before swapping mubers are : ");
        System.out.println("num 1 : "+num1 + " and " +" Num 2 : "+num2 );
        int temp = num1 ;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping numbers are : ");
        System.out.println("num 1 : "+num1 + " and " +" Num 2 : "+num2 );

        System.out.println("----------------------------------------------------------------");
        System.out.println("Before swapping numbers are : ");
        System.out.println("num 1 : "+num1 + " and " +" Num 2 : "+num2 );
        System.out.println("Swapping of number without third variable");
          num1 = num1 + num2 ;
          num2 = num1 - num2 ;
          num1 = num1 - num2 ;
        System.out.println("After swapping numbers are : ");
        System.out.println("num 1 : "+num1 + " and " +" Num 2 : "+num2 );


    }
}
