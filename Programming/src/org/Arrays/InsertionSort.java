package org.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[]={2,4,7,5,1};
		
		for (int i = 1; i < arr.length; i++) {
			
			int element=arr[i];
			int j=i-1;
			 if(arr[j]>element)
			 {
				 
				 while(j>=0 && arr[j]>element)
				 {
					 arr[j+1]=arr[j];
					 j--;
					
				 }
				 arr[j+1]=element;
				 
			 }
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			
			System.out.println(arr[k]);
		}
		
	}

}
