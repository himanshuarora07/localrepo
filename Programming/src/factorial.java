
public class factorial {
	
	public static void main(String[] args) {
		int fact=1;
		
		for (int i = 1; i <= 6; i++) {
			fact =1;			
			for (int j = 1; j < i; j++) {
				
				
				fact= fact * j;
				
				
			}
			System.out.println(fact);
			
		}
		
		
	}
}
