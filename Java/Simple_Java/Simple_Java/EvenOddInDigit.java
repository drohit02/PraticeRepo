package com.Simple_Java;

import java.util.Scanner;

public class EvenOddInDigit {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenCount,oddCount,lastDigit=0;
        evenCount = oddCount = 0 ;

        while(num!=0){
            lastDigit = num%10;
            if (lastDigit%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("Even numbers are : "+evenCount);
        System.out.println("Odd numbers are :  "+oddCount);

    }
}
