
public class Modulusfinddigit {
	
public static void main(String[] args) {
	
	int num=12345;
	int find=3;
	int last=0;
	
	 while(num>0)
	 {
		 
		 last=num%10;
		 if(last==find)
		 {
		 
		 
		 System.out.println(find+" number is exists ");
		
		 }
		 
		  num=num/10;
		 
 
		 
	 }
	
		}
	
	
}

