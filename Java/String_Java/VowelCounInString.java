package com.String_Java;

public class VowelCounInString {

	public static void main(String[] args) {
		
		String str = "aaeeiiooUU";
		char arr[] = str.toCharArray();
		int count= 0;
		
		for(int i=0;i<arr.length;i++)
		{
			switch(arr[i]) 
			{
				case 'a' : 
					count++;
					break;
				case 'e' : 
					count++;
					break;
				case 'i' : 
					count++;
					break;
				case 'o' : 
					count++;
					break;
				case 'u' : 
					count++;
					break;
				case 'A' : 
					count++;
					break;
				case 'E' : 
					count++;
					break;
				case 'I' : 
					count++;
					break;
				case 'O' : 
					count++;
					break;
				case 'U' : 
					count++;
					break;
			}
		}
		System.out.println("Vowels in string is "+count);

	}

}
