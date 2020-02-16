package org.Arrays;

public class Meanofarray {
	
	public static void main(String[] args) {
		int sum=0;
		int[] arr={11,13,17,18,27};
		
		for (int i = 0; i < arr.length; i++) {
			
			
			sum=sum+arr[i];
			
		}
		
		System.out.println(sum/arr.length);
	}
	}


