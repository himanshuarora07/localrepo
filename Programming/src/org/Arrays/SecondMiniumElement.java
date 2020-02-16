package org.Arrays;

public class SecondMiniumElement {
	
	public static void main(String[] args) {
		

		int[] arr={1,2,5,8,7};
		int min=Integer.MAX_VALUE;
		int second=0;
		
for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < min)
			{
				second=min;
				min=arr[i];
			}
			else if(arr[i]!=min && arr[i]<second)
			{
				second=arr[i];
			}
					}
		
		
		System.out.println("Minimum Element in Array is "+min);
		System.out.println("Second Minimum Element in Array is "+second);

	}
		
	}


