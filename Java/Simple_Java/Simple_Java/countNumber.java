package com.Simple_Java;

import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {

        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int countDigit = 0;
        int rem = 0;

        while(num!=0)
        {
            num = num/10;
            countDigit++;
        }
        System.out.println("The Digit in number is : "+countDigit);
    }
}
