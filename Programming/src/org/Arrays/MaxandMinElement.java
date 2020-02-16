package org.Arrays;

public class MaxandMinElement {

	public static void main(String[] args) {
		int[] arr={8,7,5,2,9};
		
		int Max=arr[0];
		int Min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if( arr[i] > Max)
			{
				Max=arr[i];
			}
			
			
			
			
			if(arr[i] < Min)
			{
				Min=arr[i];
			}
			
			
		}
		
		System.out.println("Maximum Element in Array is "+Max);
		
		System.out.println("Minimum Element in Array is "+Min);
	}
}
