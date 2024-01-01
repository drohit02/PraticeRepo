package com.Array_Java;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the array : ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element at index : "+i+" ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the Element to search in array : ");
		int searchEle = sc.nextInt();
		int i;
		for(i=0;i<size;i++) {
			if(arr[i]==searchEle) {
				break;
			}
		}
		if(i<=size-1) {
			System.out.println(searchEle+" Element found in array at position : "+(i+1));
		}
		else {
			System.out.println(searchEle+" element not found in array");
		}

	}

}
