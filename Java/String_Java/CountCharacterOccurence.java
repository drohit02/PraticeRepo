package com.String_Java;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java Programming and Java OOPS";
		int len = str.length();
		
		//find the occurence of the character "a"
		
		int len_a = str.replaceAll("O", "").length();
		
		int count = len - len_a;
		System.out.print("Count of o in String :"+count);

	}

}
