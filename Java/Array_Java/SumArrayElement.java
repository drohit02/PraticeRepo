package com.Array_Java;

import java.util.Scanner;

public class SumArrayElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr []  = new int[size];
		for(int i =0;i<size;i++) {
			System.out.print("Enter the Elememt at Index : "+i+ " ");
			arr[i] = sc.nextInt();	
		}
		System.out.print("Array Element are : ");
		for(int ele : arr) {
			System.out.print(ele +" ");
		}
		
		int sum= 0;
		for(int i = 0;i<size;i++) {
			sum = sum+arr[i];
		}
		System.out.print("\nSum of the array is :"+sum);
	}

}
