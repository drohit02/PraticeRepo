package com.String_Java;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "avaj";
		
		char[] strChar1 = str1.toCharArray();
		char[] strChar2 = str2.toCharArray();
		
		if(strChar1.length!=strChar2.length) {
			System.out.println("Both string length is not same.Hence both the string cannot bo anngram");
		}
		else {
			Arrays.sort(strChar1);
			Arrays.sort(strChar2);
			
			if(Arrays.equals(strChar1,strChar2)) {
				System.out.println("both the string are Anagram");
			}
			else {
				System.out.println("both the string are not Anagram");
			}
		}
 
	}

}
