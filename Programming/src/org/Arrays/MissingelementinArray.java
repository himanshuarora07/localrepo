package org.Arrays;

public class MissingelementinArray {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;

		int diff=0;
		int[] arr1={11,22,33,58,71};
		int[] arr2={11,22,33,71};
		
		for (int i = 0; i < arr1.length; i++) {
			
			sum1=sum1+arr1[i];
			
		}
for (int i = 0; i < arr2.length; i++) {
			
			sum2=sum2+arr2[i];
			
		}

      if(sum1>sum2)
   {
	diff=sum1-sum2;
	System.out.println("Missing number is "+diff);

     }
      
      else
      {
    	  diff=sum2-sum1;
    		System.out.println("Missing number is "+diff);

      }
	}

}
