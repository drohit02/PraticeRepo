package com.Simple_Java;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int orgNum = num ;
		int temp  = num;
		int power,rem;
		double sum;
		power = rem = 0;
		sum = 0;
		while(num>0) {
			num = num/10;
			power++;
		}
		while(orgNum>0) {
			rem = orgNum%10;
			sum = sum+Math.pow(rem,power);
			orgNum = orgNum/10;
		}
		if(temp==sum) {
			System.out.println(temp+" Number is Armstrong");
		}
		else {
			System.out.println(temp+ " number is nor armstrong");
		}

	}
}
