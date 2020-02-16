package org.Arrays;

public class Reversearrayusingsamearray {
	
	public static void main(String[] args) {
		int[] arr={3,5,7,4,1,3};
		int start=0;
		int end=arr.length-1;
		int temp=0;
		
		while(start < end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		for (int i = 0; i <=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
