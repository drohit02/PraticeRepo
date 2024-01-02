package com.String_Java;

import java.util.HashSet;

public class RemoveDuplicateinString {

	public static void main(String[] args) {
	
		String str = "java";

		String sf  = removeDuplicate(str);
		System.out.println(sf);
	}
	
	public static String removeDuplicate(String str) {
		
		HashSet<Character> charArr = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			Character ch = str.charAt(i);
			if(!charArr.contains(ch)) {
				charArr.add(ch);
				sf.append(ch);
			}
		}
		return sf.toString();
	}

}
