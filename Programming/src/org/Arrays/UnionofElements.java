package org.Arrays;

public class UnionofElements {
	
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
		int arr1[]={5,6,9,8,7};
		int arr2[]={1,2,3,4,5,6,7};
		int arr3[]=new int[arr1.length+arr2.length];
		
		int counter=0;
		for (int i = 0; i < arr1.length; i++) {
			
			if(check(arr1[i],arr3))
			{
				arr3[counter]=arr1[i];
				counter++;
			}
		}			
				for (int j = 0; j < arr2.length; j++) {
					if(check(arr2[j],arr3))
					{
						arr3[counter]=arr2[j];
						counter++;
					}
				}
				for (int i = 0; i < arr3.length; i++) {
					System.out.println(arr3[i]);
				}
				
			}
		}
