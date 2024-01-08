package com.Simple_Java;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int rem,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num ;

        while(num!=0){
            rem  = num%10;
            rev = rev*10+rem;
            num = num /10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palidrome number");
        }
        else {
            System.out.println(temp+" is not a Palidrome number");
        }
    }
}
