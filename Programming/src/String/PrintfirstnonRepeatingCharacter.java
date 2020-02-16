package String;

public class PrintfirstnonRepeatingCharacter {
	
	public static void main(String[] args) {
		
		String str="hello babu,how are you";
		
		
		for (int i = 0; i <=str.length()-1; i++) {
			
			
			int flag=1;
			for (int j = 0; j <=str.length()-1; j++) {
				
				if(i==j)
				{
					continue;
				}
				
				if(str.charAt(i)==str.charAt(j))
				{
					flag=0;
					
				}
				
			}
			
			if(flag==1)
			{
				System.out.println(str.charAt(i));
				break;
			}
			
			
			
		}
		
		
		
	}

}
