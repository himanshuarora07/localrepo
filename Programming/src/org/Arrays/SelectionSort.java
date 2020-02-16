package org.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr={0,5,2,3,1};
		
		
		for (int i = 0; i < arr.length; i++) {
			int elem=arr[i];
			int min_index=i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j]<arr[min_index])
				{
				min_index=j;
				}
				
				
			}
			arr[i]=arr[min_index];
			arr[min_index]=elem;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
	
}
