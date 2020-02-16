package String;

public class StringAnagram {
	
	static char[] sort(char arr[])
	{
		
		
		char temp;
		StringBuilder stb=new StringBuilder();
	
		
		
		
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

	
		
		return arr;
	
	
}
	
	public static void main(String[] args) {
		
		String str1="live";
		String str2="evil";
		boolean flag=true;
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		a=sort(a);
		b=sort(b);
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i])
			{
				flag=false;
			}
		}
		
		
		
	}

}
