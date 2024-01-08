package com.Simple_Java;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int rem,sum = 0;
        while (num!=0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println("Sum of Digit is : "+sum);

    }
}
