package com.Simple_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FiboSeries {

    public static void main(String [] args){

        int start = 0 ;
        int start1 = 1 ;
        int nxtEle = start+start1;
        System.out.print("Enter the element in Fibonacci-Series : ");
        Scanner sc = new Scanner(System.in);
        int count  = sc.nextInt();

        System.out.print("Fibonacci Series is : "+start+" "+start1);
        for(int i = 2;i<=count;i++){
            System.out.print(" "+nxtEle);
            start = start1;
            start1 = nxtEle;
            nxtEle = start+start1;
        }

    }

}
