
public class Automorphicnumbertwodigit {
	public static void main(String[] args) {
		
		int num=25;
		int sq= num*num;
		
		sq=sq%100;
				
		
		if(sq==num)
		{
			System.out.println(num+" is Automorphic number");
		}
		else{
			System.out.println(num+" is not Automorphic number");
		}
	}
	

}
