package com.Array_Java;

public class DeleteAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orgArr [] = {2,45,64,78,34};
		int deletEle = 45;
		
		int newArr []  = new int [orgArr.length-1];
		int index = 0;
		
		for(int i=0;i<orgArr.length;i++) {
			
			if(orgArr[i]!=deletEle) {
				newArr[index] = orgArr[i];
				index++;
			}
		}
		System.out.print("Array after removing the element : ");
		for(int ele:newArr) {
			System.out.print(ele+" ");
		}

	}

}
