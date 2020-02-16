package org.Arrays;

public class differencebyMethod {
	
	static int difference(int[] arr1,int[] arr2)
	{
		int sum1=0;
		int sum2=0;
		int diff=0;
       for (int i = 0; i < arr1.length; i++) {
			
			sum1=sum1+arr1[i];
			
			
		}
     
		for (int i = 0; i < arr2.length; i++) {
			
			sum2=sum2+arr2[i];
		}
		
		diff=sum2-sum1;
		return diff;
	}
	
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5};
		int[] arr2={6,7,8,9,2};
		System.out.println(difference(arr1,arr2));
	}

}
