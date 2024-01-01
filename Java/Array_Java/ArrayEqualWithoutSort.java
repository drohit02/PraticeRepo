package com.Array_Java;

public class ArrayEqualWithoutSort {

	public static void main(String[] args) 
	{
		
		int ar1[] = {22,45,78,95,57,11};
		int ar2[] = {78,95,57,11,22,44};
		
		boolean isArrEqual=false;
		
		if(ar1.length!=ar2.length) {
			isArrEqual = false;
		}
		else 
		{	
			isArrEqual = true;
			
			for(int i = 0;i<ar1.length;i++)
			{
				boolean eleFound = false;
				
				for(int j=0;j<ar2.length;j++)
				{
					if(ar1[i]==ar2[j])
					{
						eleFound = true;
						break;
					}
				}
				if(eleFound==false)
				{
					isArrEqual = false;
					break;
				}
			}		
		}
		if(isArrEqual==true) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both the arrays are not equal");
		}
	}

}
