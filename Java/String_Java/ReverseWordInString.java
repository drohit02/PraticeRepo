package com.String_Java;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to java world";
		
		String arr[] = str.split(" ");
		
		for(int i=arr.length-1 ;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
