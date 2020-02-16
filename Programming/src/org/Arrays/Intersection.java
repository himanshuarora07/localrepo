package org.Arrays;

import java.awt.Checkbox;

public class Intersection {
	
	static boolean check(int find,int arr[])
	{
		
		for (int i = 0; i < arr.length; i++) {
			if(find==arr[i])
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
//		int arr3[];
		
		int arr1[]={5,6,9,8,7};
		int arr2[]={1,2,3,4,5,6,7};
		
		int count=0;
				int arr3[]=new int[arr1.length];
			
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				
				if(arr1[i]==arr2[j])
				{
					
					if(check(arr1[i],arr3))
						
					{
						arr3[count]=arr1[i];
						count++;
					}
				}
				
				
				
			}
			
		}
		for (int k = 0; k < arr3.length; k++)
		{
			if(arr3[k]!=0)
			{
			System.out.println(arr3[k]);
		}
		
		}
	}
	}


