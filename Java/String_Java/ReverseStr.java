package com.String_Java;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		
		System.out.print("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
	}

}
