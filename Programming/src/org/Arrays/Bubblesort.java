package org.Arrays;

public class Bubblesort {

	
	public static void main(String[] args) {
		int[] arr={5,7,2,1,6};
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				
				if(arr[j]> arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.println("bubble sort");
					
				}
			}
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
