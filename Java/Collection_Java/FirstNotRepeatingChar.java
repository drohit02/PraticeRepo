package com.String_Java;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		
		String str = "aabbdef";
		char[] strChar = str.toCharArray();
		
		LinkedHashMap<Character,Integer> mappedChar = new LinkedHashMap<>();
		
		for(char ch:str.toCharArray()) {
			mappedChar.put(ch,mappedChar.containsKey(ch)?mappedChar.get(ch)+1:1);
		}
		
		Entry<Character,Integer> charFirst = null;
		for(Entry<Character,Integer> entry :mappedChar.entrySet()) {
			if(entry.getValue()==1)
			{
				charFirst = entry;
				break;
			}
		}
		if(charFirst!=null)
			System.out.println("First Non Repaeting charcter is :"+charFirst.getKey());

	}

}
