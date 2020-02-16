package org.Arrays;

public class MissingElementinSeries {
public static void main(String[] args) {
	
	int sum1=0;
	int sum2=0;
	int diff=0;
	int[] arr1={1,2,3,4,6,7,8};
	for (int i = 0; i < arr1.length; i++) {
		
		sum1=sum1+arr1[i];
		
		
	}
	
	
	int first=arr1[0];
	int last=arr1[arr1.length-1];
	for (int i = first; i <=last; i++) {
		
		
		sum2=sum2+i;
		
	}
	
	
//	for (int i =1 ; i < 9; i++) {
//		
//		sum2=sum2+i;
//		
//	}
	
	diff=sum2-sum1;
	System.out.println("Missing element is "+diff);
	
}
}
