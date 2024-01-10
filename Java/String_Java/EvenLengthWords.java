package com.String_Java;

public class EvenLengthWords {

	public static void main(String[] args) {
		
		String str = "Hell World This is a string";
		String[] str1 = str.split(" ");
		
		System.out.print("Even number words in string : ");
		for(int i=0;i<str1.length;i++) {
			if(str1[i].length()%2==0) {
				System.out.print(str1[i]+" ");
			}
		}

	}

}
