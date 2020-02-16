package org.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] =new int[5];
		int flag=1;
		arr[0]=21;
				arr[1]=33;
				arr[2]=76;
				arr[3]=59;
				arr[4]=44;
				
				int find=59;
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]==find)
					{
						flag=0;
						break;
					}
					else
					{
						flag=1;
					}
					
				}
				if(flag==0)
				{
				System.out.println(find+" Number is present in the array");
				}
				else
				{
					System.out.println(find+" Number is not  present in array");
				}
				
	}
	
	
	
}
