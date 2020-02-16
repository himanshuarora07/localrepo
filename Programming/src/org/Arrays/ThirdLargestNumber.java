package org.Arrays;

public class ThirdLargestNumber {
	
	public static void main(String[] args) {
		int[] arr={11,12,95,8,7,2,1};
		int Max=arr[0];
		int second=0;
		int third=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > Max)
			{
				third=second;
     			second=Max;
				Max=arr[i];	
				
			}
			else if(arr[i]!=Max && arr[i]>second)
			{
				third=second;
				second=arr[i];
			}
			
			else if(arr[i] !=second && arr[i] > third)
			{
				third=arr[i];
				
			}
			
					}
		
		
		System.out.println("Maximum Element in Array is "+Max);
		System.out.println("Second Maximum Element in Array is "+second);
		System.out.println("Third Maximum Element in Array is "+third);


	}
	}


