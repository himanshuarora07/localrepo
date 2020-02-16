package org.Arrays;

public class DemoArray {
public static void main(String[] args) {
	int[] arr=new int[10];
//	arr[0]=22;
//	arr[1]=24;
//	arr[2]=86;
//	arr[3]=112;
//	arr[4]=86;
	//arr[5]=0;
	
//	int val=arr[2];
//	System.out.println(val);
	
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//		
//	}
	
//	for (int i = 0; i < arr.length; i++) {
//		
//		arr[i]=2;
//		System.out.println(arr[i]);
//	}
	for (int i = 0; i <= 9; i++) {
		if(i%2==0)
		{
			arr[i]=2;
		}
		else
		{
			arr[i]=3;
		}
		
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}
}
