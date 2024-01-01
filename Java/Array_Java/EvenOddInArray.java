package com.Array_Java;

import java.util.Scanner;

public class EvenOddInArray {

	public static void main(String[] args) {
		
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr [] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element at index-"+i+" ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Even numbers in array : ");
		for(int i =0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("\nOdd numbers in array : ");
		for(int i= 0;i<size;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
