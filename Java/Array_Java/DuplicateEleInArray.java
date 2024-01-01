package com.Array_Java;

public class DuplicateEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {22,34,65,78,98,34,22,11,78};
		boolean flag = false;
		
		if(arr.length>1)
		{
			System.out.print("Duplicate in Array : ");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						System.out.print(arr[i]+" ");
						flag=true;
						break;
					}
				}
			}
		}
		if(flag==false) {
			System.out.println("No duplicate elemeent in array");
		}
	}
}
