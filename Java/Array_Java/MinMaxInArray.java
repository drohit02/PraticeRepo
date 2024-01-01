package com.Array_Java;

public class MinMaxInArray {

	public static void main(String[] args) {
		
		int arr []= {1,-2,101,34,5,63,98,56};
		
		int max = arr[0];
		int min = arr[0];
		
		System.out.print("Max element is array is : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i]; 
			}
		}
		System.out.println(max);
		
		System.out.print("\nMin element in array is : ");
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);

	}	
	
}
