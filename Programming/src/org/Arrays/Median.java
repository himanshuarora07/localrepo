package org.Arrays;

public class Median {
	
	
	static  int[] sort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			int ele= arr[i];
			int min_index=i;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			
			arr[i]=arr[min_index];
			arr[min_index]=ele;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[]={0,5,4,3,2,1};
		arr=sort(arr);
		if(arr.length%2==0)
		{
			int first=arr.length/2;
			int second=first-1;
			
			double sum=(arr[first]+arr[second])/2.0;
			System.out.println(sum);
		}
		
		else
		{
			System.out.println(arr[arr.length/2]);
		}
		
		
		
		

	}

}
