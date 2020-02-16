package String;

public class SortingString {
	
	public static void main(String[] args) {
		
		String str="hellobabu";
		char[] arr=str.toCharArray();
		char temp;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
				
				
			}
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			
			System.out.print(arr[k]);
			
		}
		
	}

}
