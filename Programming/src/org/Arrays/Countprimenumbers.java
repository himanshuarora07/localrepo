package org.Arrays;

public class Countprimenumbers {
	
	public static void main(String[] args)
    {
     int count=0;
     int flag=0;
     int[] arr={1,3,28,7,21,13,11,111,555,70};
      
      for(int i=0;i < arr.length; i++)
      {

           for(int j=2;j < arr[i]; j++)
          {  
        	   
        	    flag=0;
           if(arr[i]%j==0)
         { 
        	   flag=1;
        	   break;
           
           }
     
           
      }
           
           
           if(flag==0)
        		   {
        	   count++;
        	   System.out.println(arr[i]+" is a prime number");
        	   
        		   }
           
  } 
    

      System.out.println(count+"  prime numbers are present in array");
}


    }
	
	


