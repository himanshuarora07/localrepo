package org.Arrays;

public class SearchMissingElement {
	public static void main(String[] args) {
		
		
//		int sum1=0;
//		int sum2=0;
//
//		int diff=0;
		int[] arr1={11,22,33,58,71};
		int[] arr2={11,22,33,71};
		
		for (int i = 0; i < arr1.length; i++) {
      
//			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Missing Element is "+arr1[i]);
				}
				
			}
			
		}
	}

//}
