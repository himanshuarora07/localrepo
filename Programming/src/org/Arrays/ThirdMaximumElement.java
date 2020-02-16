package org.Arrays;

public class ThirdMaximumElement {

public static void main(String[] args) {
		
		int[] arr={115,8,7,2,1};
		int Max=arr[0];
		int second=0;
		int third=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > Max)
			{
				
     			second=Max;
				third=second;
				Max=arr[i];
				
				
				
			}
			else if(arr[i]!=Max && arr[i]>second)
			{
				second=third;
				second=arr[i];
			}
			
			
					}
		
		
		System.out.println("Maximum Element in Array is "+Max);
		System.out.println("Second Maximum Element in Array is "+second);
		System.out.println("Third Maximum Element in Array is "+third);


	}
}
