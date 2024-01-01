package com.Array_Java;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.print("Enter the Size of the array : ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		for(int i=0;i<size;i++) {
			System.out.print("enter(sorted) ele at index-"+i+" : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("\nEnter the Element to Search : \n");
		int searchEle = sc.nextInt();
		
		int start = 0;
		int end = size-1;
		boolean flag = false; 

		for(int i=start;i<=end;i++) {
			
			int mid = (start+end)/2;
			
			if(arr[mid]==searchEle) 
			{
				System.out.print(searchEle+" Element found in array");
				flag=true;
				break;
			}
			else if(searchEle>arr[mid]) {
				start = mid+1;
			}
			else if(searchEle<arr[mid]) {
				end = mid-1;
			}
		}
		if(flag==false) {
			System.out.println(searchEle+" Element not found in array");
		}
	}

}
