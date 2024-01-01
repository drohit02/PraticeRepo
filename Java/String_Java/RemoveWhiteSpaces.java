package com.String_Java;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java Programming and Spring";
		//Removing all white spaces using replaceAll method
		
		str = str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
