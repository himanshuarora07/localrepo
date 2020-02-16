package org.Arrays;

public class LinearsearchbyMethod {
	static boolean search(int arr[],int find)
	{
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==find)
			{
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr={11,12,13,14,15};
		System.out.println(search(arr, 14));
	}

}
