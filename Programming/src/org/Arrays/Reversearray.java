package org.Arrays;

public class Reversearray {
	
	public static void main(String[] args) {
		
		int[] arr={3,5,7,8,9};
		int[] arr1 =new int[arr.length];
		
		int count=0;
	
		for (int i = arr.length-1; i >= 0; i--) {
			
			
			arr1[count]=arr[i];
			//System.out.println(arr1[count]);
			count++;
			
		}
		for (int j = 0; j < arr1.length; j++) {
			
			System.out.println(arr1[j]);
		}
	}

}
