package org.Arrays;

public class SumbyMethod {

	static int sum(int[] arr)
	{
		int Sum=0;
		for (int i = 0; i < arr.length; i++) {
			
			Sum=Sum+arr[i];
			
		}
		return Sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr={11,13,17,18,27};
		System.out.println(SumbyMethod.sum(arr));
	}
}
