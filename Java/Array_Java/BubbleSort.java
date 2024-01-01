package com.Array_Java;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("Enter the sixe of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr [] = new int [size];
		for(int i=0;i<size;i++) {
			System.out.print("enter the element ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Before Sorting-Array : ");
		for(int ele :arr ) {
			System.out.print(ele+" ");
		}
		for(int i=0;i<size-1;i++) {
			
			for(int j=0;j<size-1;j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ; 
				}
			}
		}
		System.out.print("\nAfter sorting-Array : ");
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
	}

}
