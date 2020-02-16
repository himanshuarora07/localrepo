package org.Arrays;

public class SecondMaxiumElement {
	
	public static void main(String[] args) {
		
		int[] arr={5,8,7,2,1};
		int Max=arr[0];
		int second=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > Max)
			{
				second=Max;
				Max=arr[i];
			}
			else if(arr[i]!=Max && arr[i]>second)
			{
				second=arr[i];
			}
					}
		
		
		System.out.println("Maximum Element in Array is "+Max);
		System.out.println("Second Maximum Element in Array is "+second);

	}

}
