package com.String_Java;

import java.util.Arrays;

public class SortCharOfString {

	public static void main(String[] args) {
		
		String str = "hello";
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		System.out.print("sorted the chacted of the string : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
