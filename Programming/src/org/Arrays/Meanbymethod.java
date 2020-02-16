package org.Arrays;

public class Meanbymethod {
	static double mean(int arr[])
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			
		}
		double mean=sum/arr.length;
		return mean;
	}
	public static void main(String[] args) {
		int[] arr={11,13,15,17,17};
		System.out.println(Meanbymethod.mean(arr));
	}
}
