package com.String_Java;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a*dgd$djjk&jaaajl3";
		
		//this is regular expressin used to remove special character
		
		String plainStr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainStr);
	}

}
