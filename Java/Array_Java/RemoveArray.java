package com.Array_Java;

public class RemoveArray {

	public static void main(String[] args) {
		
		int orgArr [] = {21,33,67,89,34,45,90,65,78};
		int removeEle = 89;
		int index = 0;
		int newArr [] = new int[orgArr.length-1];
		
		System.out.print("Old Array is : ");
		for(int i=0;i<orgArr.length;i++) {
			System.out.print(orgArr[i]+" ");
		}
		System.out.print("\nElement is to remove is : "+removeEle);
		for(int i=0;i<orgArr.length;i++) {
			if(orgArr[i]!=removeEle) {
				newArr[index] = orgArr[i];
				index++;
			}
		}
		System.out.print("\nNew Array is : ");
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}

	}

}
