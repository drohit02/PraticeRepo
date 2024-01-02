package com.Collection_Java;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		String arr [] = {"java","cpp","c","java","python","cpp"};
		
		HashSet<String> myArr = new HashSet<>();
		
		System.out.print("Duplicate in array : ");
		for(int i = 0;i<arr.length;i++)
		{
			if(myArr.add(arr[i])==false) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
