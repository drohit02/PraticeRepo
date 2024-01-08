package com.Simple_Java;

import java.util.Iterator;
import java.util.Scanner;

public class ArmStrongNumRange {

	public static void main(String[] args) {
		int begin,end,rem,temp;
		double sum ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st Range for ArmStrong Num : ");
		begin = sc.nextInt();
		
		System.out.print("\nEnter the 2nd Range for ArmStrong Num : ");
		end = sc.nextInt();
		
		for (int i = begin; i <=end; i++) {
			int power = 0; 
			sum = 0;
			temp = i;
			while(temp>0) {
				temp/=10;
				power++;
			}
			temp = i;
			while(temp>0) {
				rem = temp%10;
				sum = sum +Math.pow(rem, power);
				temp= temp/10;
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
	}

}
