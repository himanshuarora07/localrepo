package org.Arrays;

public class DifferenceofTwoarrays {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int diff=0;
		
		int[] arr1={1,2,3,4,5};
		for (int i = 0; i < arr1.length; i++) {
			
			sum1=sum1+arr1[i];
			
		}
		
		int[] arr2={6,7,8,9,2};
		for (int i = 0; i < arr2.length; i++) {
			
			sum2=sum2+arr2[i];
		}
		
		diff=sum2-sum1;
		System.out.println(diff);
	}
}
