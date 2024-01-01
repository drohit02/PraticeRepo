package com.Array_Java;

import java.util.Arrays;

public class TwoArrayEqual {

	public static void main(String[] args) {

		int ar1 [] = {22,45,23,67,26,98};
		int ar2 [] = {67,45,98,22,26,23};
		int flag = 0;
		
		if(ar1.length!=ar2.length) {
			flag = 1;
		}
		else {
			
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
			for(int i=0,j=0;i<ar1.length;i++,j++) 
			{
				if(ar1[i]!=ar2[j]) {
					flag = 1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("Both the arrays are equal");
		}
		else {
			System.out.println("Both the arrays are not equal");
		}
	}
}
