package org.Arrays;

public class MissingElementinEvenSeries {
public static void main(String[] args) {
	
	
	int sum1=0;
	int sum2=0;
	int diff=0;
	int[] arr1={2,4,8,10};
	for (int i = 0; i < arr1.length; i++) {
		
		sum1=sum1+arr1[i];
		
		
	}
	
	
	int first=arr1[0];
	int last=arr1[arr1.length-1];
	for (int i = first; i <=last; i=i+2) {
		
		
		sum2=sum2+i;
		
	}
	diff=sum2-sum1;
	System.out.println("Missing element is "+diff);
	
}
}
